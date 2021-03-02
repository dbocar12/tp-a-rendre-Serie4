package com.hakimbocar.exo10;

import java.util.function.BiFunction;
import java.util.function.Function;

public class exo10 {
    public static void main(String[] args) {

        Function<String, String> functionToUpper = (s) -> s.toUpperCase();
        System.out.println("It converts the given string's to UpperCase with Function: ");
        System.out.println(functionToUpper.apply("Hi"));
        System.out.println(functionToUpper.apply("Hello"));
        System.out.println("=============================================================");

        Function<String, String> functionIdentity = (s) -> s;
        System.out.println("It returns the given string identically with Function: ");
        System.out.println(functionIdentity.apply("Hi"));
        System.out.println(functionIdentity.apply(""));
        System.out.println("=============================================================");

        Function<String, Integer> functionLength = (s) -> s.length();
        System.out.println("It returns the given string's length with Function: ");
        System.out.println(functionLength.apply("Hi"));
        System.out.println(functionLength.apply(""));
        System.out.println("=============================================================");

        Function<String, String> functionAddParentheses = (s) -> s = '('+s+')';
        System.out.println("It returns the given string in parentheses with Function: ");
        System.out.println(functionAddParentheses.apply("Hi"));
        System.out.println(functionAddParentheses.apply(""));
        System.out.println("=============================================================");

        BiFunction<String, String, Integer> BiFunctionPositionStrings = (s1, s2) -> s1.indexOf(s2);
        System.out.println("It returns the position of the s2 in s1 with BiFunction: ");
        System.out.println(BiFunctionPositionStrings.apply("Bonjour","nj"));
        System.out.println(BiFunctionPositionStrings.apply("Hello","Bonjour"));
        System.out.println("=============================================================");

        Function<String, Integer> functionReturnPosition = (s) ->
                BiFunctionPositionStrings.apply("abcdefghi",s);
        System.out.println("It returns the position of the s2 in 'abcdefghi' with function: ");
        System.out.println(functionReturnPosition.apply("gh"));
        System.out.println(functionReturnPosition.apply("ab"));
        System.out.println(functionReturnPosition.apply("ij"));


    }
}
