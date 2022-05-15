package sda;

import sda.collections.Gender;
import sda.collections.Person;
import sda.collections.ShoppingQueue;

import java.util.Deque;
import java.util.LinkedList;

public class CollectionsQueueMain {

    public static void main(String[] args) {
        Deque<Integer> myQueue = new LinkedList<>();

        myQueue.add(1);
        myQueue.add(5);
        myQueue.add(3);
        myQueue.add(8);

        System.out.println("Stan kolejki: " + myQueue);

        System.out.println("peek first: " + myQueue.peekFirst());
        System.out.println("peek last: " + myQueue.peekLast());

        System.out.println("Stan kolejki: " + myQueue);

        System.out.println("poll first: " + myQueue.pollFirst());
        System.out.println("poll last: " + myQueue.pollLast());

        System.out.println("Stan kolejki: " + myQueue);


        Person romek = new Person("Romek", 30, Gender.MALE);
        Person ala = new Person("Ala", 13, Gender.FEMALE);
        Person jan = new Person("Jan", 24, Gender.MALE);
        Person ola = new Person("Ola", 10, Gender.FEMALE);

        ShoppingQueue shoppingQueue = new ShoppingQueue();
        shoppingQueue.addCustomer(romek);
        shoppingQueue.addCustomer(ala);
        shoppingQueue.addCustomer(jan);
        shoppingQueue.addCustomer(ola);

        System.out.println(shoppingQueue.serviceCustomer());
        System.out.println(shoppingQueue.serviceCustomer());
        System.out.println(shoppingQueue.serviceCustomer());
        System.out.println(shoppingQueue.serviceCustomer());
        System.out.println(shoppingQueue.serviceCustomer());
    }
}