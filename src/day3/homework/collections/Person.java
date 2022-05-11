package day3.homework.collections;

import java.util.Objects;
import java.util.Scanner;

public class Person /*implements Comparable<Person>*/ {
    private String username;
    private int age;
    private Gender gender; //enum

    public enum Gender {
        kobieta, mężczyzna, inna
    }

    /*@Override
    public int compareTo(Person person) {
        return 0;
    }*/



    public Person(String username, int age, String gender) {
        this.username = username;
        this.age = age;
        try {
            this.gender = Gender.valueOf(gender.toLowerCase());
        } catch (IllegalArgumentException e) {
            System.out.print("Płeć " + this.username + " musi przyjmowac wartość: kobieta, mężczyzna, inna. Podaj właściwą wartość: ");
            Scanner scanner = new Scanner(System.in);
            gender = scanner.nextLine();
            this.gender = Gender.valueOf(gender.toLowerCase());
        }
    }

    @Override
    public String toString() {
        String result = username + ",\t" + age + " lat,\t" + gender.name();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(username, person.username) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, age, gender);
    }
}


