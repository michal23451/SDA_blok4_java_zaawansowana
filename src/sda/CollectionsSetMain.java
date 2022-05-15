package sda;

import sda.collections.Gender;
import sda.collections.Person;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsSetMain {

    public static void main(String[] args) {
        Person romek = new Person("Romek", 30, Gender.MALE);
        Person ala = new Person("Ala", 13, Gender.FEMALE);
        Person jan = new Person("Jan", 24, Gender.MALE);
        Person ola = new Person("Ola", 10, Gender.FEMALE);

        Set<Person> mySet = new HashSet<>();

        mySet.add(romek);
        mySet.add(romek);
        mySet.add(ala);
        mySet.add(ala);
        mySet.add(jan);
        mySet.add(jan);
        mySet.add(ola);
        mySet.add(ola);

        for (Person value : mySet) {
            System.out.println("Wartość ze zbioru: " + value);
        }

        System.out.println("Posortowane wartości");

        Set<Person> sortedSet = new TreeSet<>(mySet);

        for (Person value : sortedSet) {
            System.out.println("Wartość ze zbioru: " + value);
        }
    }
}