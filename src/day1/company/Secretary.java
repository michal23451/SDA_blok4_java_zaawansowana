package day1.company;

public final class Secretary extends Employee {

    public Secretary(String name, int salary, int age) {
        super(name, salary, age);
        System.out.printf("Wywołuję konstruktor z klasy Secretary z argumentami: %s i %s i %s\n", name, salary, age);
    }

    public void makeCall(String number) {
        System.out.printf("Dzwonię do: " + number);
    }
}
