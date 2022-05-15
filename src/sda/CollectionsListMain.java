package sda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsListMain {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(5);
        myList.add(3);
        myList.add(8);
        myList.add(5);

        for (int i = 0; i < myList.size(); i++) {
            Integer value = myList.get(i);
            System.out.println("Wartość z listy: " + value);
        }

        Collections.sort(myList);

        System.out.println("Posortowane wartości");

        for (int i = 0; i < myList.size(); i++) {
            Integer value = myList.get(i);
            System.out.println("Wartość z listy: " + value);
        }
    }
}