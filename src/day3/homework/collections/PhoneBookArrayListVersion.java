package day3.homework.collections;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookArrayListVersion {
    private List<Person> personList = new ArrayList<>();
    private List<String[]> phoneNumberList = new ArrayList<>();

    public void addPersonArrayList(String number, Person person) {
        personList.add(person);
        String[] input = {Integer.toString(person.hashCode()), number};
        phoneNumberList.add(input);
    }

    public Person searchPersonArrayList(String number) {
        String hashCodeToCompare = getPersonHashCodeFromNumber(number);

        for (Person p : personList) {
            if (Integer.toString(p.hashCode()).equals(hashCodeToCompare)) {
                return p;
            }
        }
        return null;
    }

    public void removePersonArrayList(String number) {
        String hashCodeToCompare = getPersonHashCodeFromNumber(number);
        for (Person p : personList) {
            if (Integer.toString(p.hashCode()).equals(hashCodeToCompare)) {
                personList.remove(p);
                break;
            }
        }
        for (String[] s : phoneNumberList) {
            if (s[0].equals(hashCodeToCompare)) {
                phoneNumberList.remove(s);
                break;
            }
        }
        //System.out.println("log: " + personList.size() + " " + phoneNumberList.size());
    }


    //moje metody
    public void showArrayList() {
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            String personHashCodeToCompare = Integer.toString(person.hashCode());
            String[] number = new String[2];
            for (int j = 0; j < phoneNumberList.size(); j++) {
                String hashCodeToCompare = (phoneNumberList.get(j))[0];
                if (personHashCodeToCompare.equals(hashCodeToCompare)) {
                    number = phoneNumberList.get(j);
                    break; //upraszczamy, że jedna osoba ma jeden numer
                } else {
                    number[1] = "brak numeru";
                }
            }
            System.out.println(person + ",\ttel. " + number[1]);
            //+ "\t\t\thashCodeCompare: " + person.hashCode() + " = " + number[0]);
        }
    }

    private String getPersonHashCodeFromNumber(String number) {
        for (String[] i : phoneNumberList) {
            if (i[1] == number) {
                return i[0];
            }
        }
        return null;
    }


}
