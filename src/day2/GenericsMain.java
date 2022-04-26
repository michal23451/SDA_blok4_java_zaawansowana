package day2;

import day2.fruits.Apple;
import day2.fruits.Box;
import day2.fruits.Fruit;
import day2.fruits.WeightProvider;

public class GenericsMain {

    public static void main(String[] args) {
        Apple apple = new Apple(10);                     // klasa Apple dziedzicząca po Fruit, który implementuje WeightProvider

        Box<Fruit> fruitBox = new Box<>(apple);                 // klasa Box z określonym typem generycznym Fruit, może przyjmować wszystkie klasy dziedziczące po Fruit

        Box<WeightProvider> superBox = new Box<>(fruitBox);     // klasa Box z określonym typem generycznym WeightProvider, może przyjmować wszystkie klasy implementujące WeightProvider

        System.out.println(superBox.getWeight());               // 10 - waga apple
    }                                                           // 1  - waga fruitBox
}                                                               // 1  - waga superBox