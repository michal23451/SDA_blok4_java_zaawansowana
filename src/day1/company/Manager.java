package day1.company;

public class Manager extends Employee {

    private int bonus;
    private Secretary secretary;

    public Manager(String name, int salary) {
        super(name, salary, 0);
        System.out.println("Wywołuję konstruktor z klasy Manager z argumentami: " + name + " i " + salary);
    }

    public Manager(String name, int salary, int bonus, int age) {
        super(name, salary, age);
        this.bonus = bonus;
        System.out.println("Wywołuję konstruktor z klasy Manager z argumentami: " + name + " i " + salary + " i " + bonus + " i " + age);
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }

    public void makeCall(String number) {
        if (this.secretary == null) {
            System.out.println("Nie umiem dzwnonić");
        } else {
            this.secretary.makeCall(number);
        }
    }

    public void makeSpeech() {
        System.out.println("Do pracy!");
    }

    public void makeSpeech(String additionalMessage) {
        makeSpeech();
        System.out.println(additionalMessage);
    }

    @Override
    public int getSalary() {
        // return getSalary() + bonus;
        return salary + bonus;
    }
}
