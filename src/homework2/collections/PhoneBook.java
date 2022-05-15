package homework2.collections;

import day2.electronics.Phone;

import java.util.*;
import java.util.Map.Entry;

public class PhoneBook extends AbstractPhoneBook implements InterfacePhoneBook {
    private Map<String, Person> phoneBookMap = new HashMap<>();

    public void addPerson(String number, Person person) {
        phoneBookMap.put(number, person);
    }

    public Person searchPerson(String number) {
        return phoneBookMap.get(number);
    }

    public void removePerson(String number) {
        phoneBookMap.remove(number);
    }


    //moje metody
    public void show() {
        Set<Entry<String, Person>> entrySet = phoneBookMap.entrySet();

        //for (Entry<String, Person> element : entrySet) {
        //    System.out.printf("%s,\ttel. %s\n", element.getValue(), element.getKey());
        //}

        //lub z iteratorem
        Iterator<Entry<String, Person>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Entry<String, Person> tmp = iterator.next();
            System.out.printf("%s,\ttel. %s\n", tmp.getValue(), tmp.getKey());
        }
    }

    //test klasy abstrakcyjnej
    public int testAbstractClass() {
        return 5;
    }

    //test interfejsu {
    public int testInterface() {
        return 5;
    }






}
