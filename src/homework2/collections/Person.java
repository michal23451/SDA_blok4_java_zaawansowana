package homework2.collections;

import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Person implements Comparable<Person>, Comparator<Person> {
    private String username;
    private int age;
    private Gender gender; //enum

    public enum Gender {
        kobieta, mężczyzna, inna
    }


    //test interfejsu Comparable
    @Override
    public int compareTo(Person person) {
        System.out.println("compareTo z interfejsu Comparable");
        if (this.age > person.age) {
            return 1; //zwracamy coś > 0
        } else if (this.age < person.age) {
            return -1; //zwracamy coś < 0
        } else { // gdy this.age == person.age
            return 0;
        }
        //lub po prostu
        //return this.age - person.age;
    }

    @Override
    public int compare(Person person1, Person person2) {
        System.out.println("compare z interfejsu Comparator (klasa person)");
                /*if (person1.getAge > person2.getAge) {
                    return 1;
                } else if (person1.age < person2.age) {
                    return -1;
                } else { // gdy person1.age == person2.age
                    return 0;
                }*/
        //lub po prostu
        return person1.age - person2.age;
    }

    public Person() {
    }

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

    public int getAge() {
        return age;
    }


}


