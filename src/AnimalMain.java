import animals.Cat;
import animals.Dog;
import animals.Runner;

public class AnimalMain {

    public static void main(String[] args) {
        Runner runnerDog = new Dog("Ares");
        Runner runnerCat = new Cat("Mruczek");

        runnerDog.count();
        runnerCat.count();
    }
}
