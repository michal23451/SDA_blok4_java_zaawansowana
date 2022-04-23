package animals;

public class Cat extends Animal implements Runner {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void saySomething() {
        System.out.println(name + " miau miau");
    }

    @Override
    public void run() {
        System.out.println("Skik skik");
    }
}
