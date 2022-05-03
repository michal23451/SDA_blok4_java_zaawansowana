package day2.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;

public class Student {
    private final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    private UUID id = UUID.randomUUID();
    private String name;
    private LocalDate birthDate;
    private Address address;
    //private int points = new Random().nextInt(1, 50);
    private int points = new Random().nextInt(26, 50); //testowo, zamiast powyższej linii

    /*
     *
     *
     *   moje metody
     *
     *
     */

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public UUID getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate.format(DATE_FORMATTER) +
                ", address=" + address +
                ", points=" + points +
                '}';
    }

    public Student(String name, String birthDate, String place, String streetAndNumber) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate, DATE_FORMATTER);
        this.address = new Address(place, streetAndNumber);
        //System.out.println("Utworzono studenta!");
    }

    public Student() {
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

}
