package homework2.collections;


import java.util.*;

public class CollectionsMain {
    public static void main(String[] args) {


        Person person1 = new Person("1 Jan Kowalski", 29, "mężczyzna");
        Person person2 = new Person("2 Anna Nowak", 35, "kobieta");
        Person person3 = new Person("3 Piotr Nowacki", 18, "mężczyzna");
        Person person4 = new Person("4 Andrzej Wiśniewski", 22, "mężczyzna");
        Person person5 = new Person("5 Joanna Sienkiewicz", 18, "mężczyzna");
        Person person6 = new Person("6 Marcin Marcinkowski", 51, "mężczyzna");

        System.out.println("MAP\n\n");
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addPerson("123 456 789", person1);
        phoneBook.addPerson("789 000 555", person2);
        phoneBook.addPerson("999 888 777", person3);

        System.out.println("phoneBook.show:");
        phoneBook.show();

        System.out.println("\nphoneBook.searchPerson:");
        Person p = phoneBook.searchPerson("789 000 555");
        System.out.println(p);

        System.out.println("\nphoneBook.removePerson:");
        phoneBook.removePerson("789 000 555");
        phoneBook.removePerson("111 111 111");
        phoneBook.show();



        /*
        //wersja na ArrayList:
        PhoneBookArrayListVersion phoneBook = new PhoneBookArrayListVersion();
        phoneBook.addPersonArrayList("123 456 789", new Person("Jan Kowalski", 29, "mężczyzna"));
        phoneBook.addPersonArrayList("789 000 555", new Person("Anna Nowak", 35, "kobieta"));
        phoneBook.addPersonArrayList("999 888 777", new Person("Piotr Nowacki", 18, "mężczyzna"));

        System.out.println("phoneBook.show:");
        phoneBook.showArrayList();

        System.out.println("\nphoneBook.searchPerson:");
        Person person = phoneBook.searchPersonArrayList("789 000 555");
        System.out.println(person);

        System.out.println("\nphoneBook.removePerson:");
        phoneBook.removePersonArrayList("789 000 555");
        phoneBook.showArrayList();
        */

        System.out.println("QUEUE\n\n");
        ShoppingQueue shoppingQueue = new ShoppingQueue();
        System.out.println("shoppingQueue.addCustomer");
        shoppingQueue.addCustomer(person1);
        shoppingQueue.addCustomer(person2);
        shoppingQueue.addCustomer(person3);
        shoppingQueue.addCustomer(person4);
        shoppingQueue.addCustomer(person5);
        shoppingQueue.addCustomer(person6);
        shoppingQueue.show();
        System.out.println("\nshoppingQueue.serviceCustomer");
        shoppingQueue.serviceCustomer(person1);
        shoppingQueue.serviceCustomer(person2);
        shoppingQueue.serviceCustomer(person4);
        shoppingQueue.serviceCustomer(person5);
        shoppingQueue.serviceCustomer(person6);
        shoppingQueue.show();
        shoppingQueue.serviceCustomer(person3);
        shoppingQueue.serviceCustomer(person3);
        shoppingQueue.serviceCustomer(person3);
        shoppingQueue.show();

        System.out.println("\n\n");
        //test interfejsów Comparable i Comparator
        List<Person> test1 = new ArrayList<>();
        test1.add(person1);
        test1.add(person2);
        test1.add(person3);
        List<Person> test2 = new ArrayList<>(test1);
        List<Person> test3 = new ArrayList<>(test1);
        List<Person> test4 = new ArrayList<>(test1);
        System.out.println("\n\nBez sortowania:\n" + test1);
        System.out.println("\n\n");

        Collections.sort(test1); //test Comparable
        System.out.println("Comparable:\n" + test1);
        System.out.println("\n\n");


        Comparator<Person> comparator = new Comparator<Person>() {//test Comparator
            @Override
            public int compare(Person person1, Person person2) {
                System.out.println("compare z interfejsu Comparator (klasa anonimowa w main)");
                /*if (person1.getAge() > person2.getAge()) {
                    return 1;
                } else if (person1.getAge() < person2.getAge()) {
                    return -1;
                } else { // gdy person1.getAge() == person2.getAge()
                    return 0;
                }*/
                //lub po prostu
                return person1.getAge() - person2.getAge();
            }
        };
        Collections.sort(test2, comparator);
        //lub
        //test2.sort(comparator);
        System.out.println("Comparator z klasy anonimowej w main:\n" + test2);
        System.out.println("\n\n");

        //lub comparator z klasy Person
        Collections.sort(test3, new Person());
        System.out.println("Comparatorz klasy Person:\n" + test3);


        //lub za pomocą wyrażenia lambda
        System.out.println("\n\nComparator lambda");
        Comparator<Person> comparatorLambda = (p1, p2) -> p1.getAge() - p2.getAge();
        System.out.println(test4);
        Collections.sort(test4, comparatorLambda);
        System.out.println(test4);

        System.out.println("\n\n");
        System.out.println("KONIEC");

        Collections.sort(test1);
        Collections.sort(test1,new Person());
        Collections.sort(test1,comparator);

    }
}
