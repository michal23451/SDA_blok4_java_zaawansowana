package homework2.collections;

import java.util.*;

public class ShoppingQueue {
    Queue<Person> personQueue = new ArrayDeque<>();

    public void addCustomer(Person p) {
        personQueue.add(p);
        System.out.println("Element dodany. Aktualny rozmiar kolejki: " + personQueue.size());
    }

    public Person serviceCustomer(Person p) {
        Person tmp = null;

        try {
            if (personQueue.size() > 0) {
                for (Person element : personQueue) {
                    if (element.equals(p)) {
                        tmp = element;
                        personQueue.remove(element);
                        System.out.println("Element: " + element + " usunięty. Aktualny rozmiar kolejki: " + personQueue.size());
                        return tmp;
                    }
                }
            } else {
                throw new RuntimeException("Pusta kolejka");
            }
        } catch (RuntimeException e) {
            System.out.println("Przechwycono wyjątek RuntimeException");
        }

        return tmp;
    }

    public void show() {
        for (Person element : personQueue) {
            System.out.println(element);
        }
    }

    public Queue<Person> getPersonQueue() {
        return personQueue;
    }
}


