package com.hakimbocar.exo9;

import java.util.function.Predicate;

public class exo9 {
    public static void main(String[] args) {
        Predicate<String> lengthMoreThan4 = (s) -> (s.length() > 4);
        System.out.println("It test if the given string's length is greather than 4 with predicate: ");
        System.out.println(lengthMoreThan4.test("Hi"));
        System.out.println(lengthMoreThan4.test("Hello"));
        System.out.println(lengthMoreThan4.test("HelloPO"));
        System.out.println("=============================================================");

        Predicate<String> notEmpty = String::isEmpty; // Without Lambda Expression
        //Predicate<String> notEmpty = (s) -> (s.isEmpty()); // with Lambda Expression
        System.out.println("It test if the given string is empty with predicate: ");
        System.out.println(notEmpty.test(""));
        System.out.println(notEmpty.test("Hello"));
        System.out.println("=============================================================");

        Predicate<String> startsWithJ = (s) ->(s.startsWith("J"));
        System.out.println("It test if the given string starts with 'J' using predicate: ");
        System.out.println(startsWithJ.test("Hi"));
        System.out.println(startsWithJ.test("Jello"));
        System.out.println("=============================================================");

        Predicate<String> lengthIsFive = (s) ->(s.length()==5);
        System.out.println("It test if the given string's length is 5 using predicate: ");
        System.out.println(lengthIsFive.test("Hi"));
        System.out.println(lengthIsFive.test("Hello"));
        System.out.println(lengthIsFive.test("HelloMe"));
        System.out.println("=============================================================");

        //Predicate<String> startsWithJandHasLengthIs5 = (s) ->(s.startsWith("J") && s.length()==5);
        Predicate<String> startsWithJandHasLengthIs5 = (s) ->(startsWithJ.test(s) &&lengthIsFive.test(s));
        System.out.println("It test if the given string starts with 'J' and length is 5 using predicate: ");
        System.out.println(startsWithJandHasLengthIs5.test("Hi"));
        System.out.println(startsWithJandHasLengthIs5.test("Jello"));
        System.out.println(startsWithJandHasLengthIs5.test("JelloP"));
        System.out.println("=============================================================");

    }
}
