package day1;

import day1.animals.Cat;
import day1.animals.Dog;
import day1.animals.Runner;

public class AnimalMain {

    public static void main(String[] args) {
        Runner runnerDog = new Dog("Ares");
        Runner runnerCat = new Cat("Mruczek");

        runnerDog.count();
        runnerCat.count();
    }
}
