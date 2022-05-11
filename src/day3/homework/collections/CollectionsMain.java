package day3.homework.collections;


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


        System.out.println("KONIEC");

    }
}
