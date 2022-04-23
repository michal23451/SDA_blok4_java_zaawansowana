package animals;

public class Duck extends Bird {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void saySomething() {
        System.out.println(name + " kwa kwa");
    }
}
