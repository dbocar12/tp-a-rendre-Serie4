package com.hakimbocar.exo11;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class exo11 {

    public static void main(String[] args) {

        List<String> JavaListDevs = Arrays.asList("Jose","Paul","Didier","Bocar","Hakim","Rayane",
                "Makerem","Hela");
        System.out.println("List of JAVA developer :");
        JavaListDevs.forEach((developer)->System.out.println(developer+"\tLength->"+developer.length()));

        // comparator that compare by length of the string
        Comparator<String> lengthComparator = (s1, s2) -> s2.length() - s1.length();

        // sorting by length of the string
        JavaListDevs.sort(lengthComparator);
        System.out.println("===========================================================");
        System.out.println("List sorted by length of string :");
        JavaListDevs.forEach((developer)->System.out.println(developer+"\tLength->"+developer.length()));
        System.out.println("===========================================================");

        List<Person> persons = Arrays.asList(
                new Person("Bocar", "Diallo",23),
                new Person("Hakim", "Ben Taarit",22),
                new Person("Roronoa", "Zoro",24),
                new Person("Monkey", "D.Luffy",18),
                new Person("Alex", "Zoro",26),
                new Person("Bocar", "Ba",26)

        );

        System.out.println("Before Sorting the person data:");
        persons.forEach(System.out::println);
        System.out.println("===========================================================");

        // comparator that compare by lastName of Person
        Comparator<Person> lastNameComparator = Comparator.comparing(Person::getLastName);

        // sorting by LastName
        persons.sort(lastNameComparator);
        System.out.println("After Sorting by lastName the person data:");
        persons.forEach(System.out::println);
        System.out.println("===========================================================");

        // comparator that compare by lastName then fistName of Person
        Comparator<Person> lastNameThenFistNameComparator = (p1, p2)->  {
            if ((p1.getLastName().compareTo(p2.getLastName()) == 0 )) {
                return p1.getFirstName().compareTo(p2.getFirstName());
            }
            return p1.getLastName().compareTo(p2.getLastName());
        };

        // sorting by LastName then firstname
        persons.sort(lastNameThenFistNameComparator);
        System.out.println("After Sorting by LastName then FirstName the person data:");
        persons.forEach(System.out::println);
        System.out.println("===========================================================");

        Comparator<Person> lastNameThenFistNameComparatorReversed = lastNameThenFistNameComparator.reversed();
        persons.sort(lastNameThenFistNameComparatorReversed);
        System.out.println("After Sorting by LastName then FirstName reversed the person data:");
        persons.forEach(System.out::println);

        System.out.println("===========================================================");
        // comparator that compare by lastName then fistName if necessary of Person
        Comparator<Person> FirstNameThenLastNameComparator = (p1, p2)->  {
            if ((p1.getFirstName().compareTo(p2.getFirstName()) == 0 )) {
                return p1.getLastName().compareTo(p2.getLastName());
            }
            return p1.getFirstName().compareTo(p2.getFirstName());
        };


        // sorting by FistName and LastName
        persons.sort(FirstNameThenLastNameComparator);
        System.out.println("After Sorting by FistName then LastName the person data:");
        persons.forEach(System.out::println);
        System.out.println("===========================================================");


        List<Person> personsWithNull = Arrays.asList(
                new Person("Bocar", "Diallo",23),
                new Person("Hakim", "Ben Taarit",22),
                new Person("Roronoa", "Zoro",24),
                null,
                new Person("Paul", "Jackson",26),
                null

        );


        // Comparator that put all null values at the end
        Comparator<Person> lastNameThenFistNameComparatorWithNullValue=
                Comparator.nullsLast(lastNameThenFistNameComparator);


        System.out.println("Before Sorting the person data with null value:");
        personsWithNull.forEach(System.out::println);
        System.out.println("===========================================================");

        // sorting by LastName and firstname reversed order with null value
        personsWithNull.sort(lastNameThenFistNameComparatorWithNullValue);
        System.out.println("After Sorting by LastName then FirstName the person with null data:");
        personsWithNull.forEach(System.out::println);
        System.out.println("===========================================================");


    }


}
