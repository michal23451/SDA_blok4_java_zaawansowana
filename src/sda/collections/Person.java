package sda.collections;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private String username;
    private int age;
    private Gender gender;

    public Person(String username, int age, Gender gender) {
        this.username = username;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
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

    @Override
    public String toString() {
        return "Person{" + "username='" + username + '\'' + ", age=" + age + ", gender=" + gender + '}';
    }
}
