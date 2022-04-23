package company;

public class Employee {

    private String name;
    int salary;
    private final int age;

    public Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        System.out.println("Wywołuję konstrukrtor klasy Employee z argumentami: " + name + " i " + salary + " i " + age);
    }

    public Employee(String name) {
        this.name = name;
        this.age = 20;
    }

    public int getSalary() {
        return salary;
    }

    public void show() {
        System.out.println("Mam na imię " + name + " i zarabiam " + salary + " i mam lat " + age);
    }
}