package homework2.collections;

public interface InterfacePhoneBook {
     String testAbstract1="2"; //domyślnie public static final


    void addPerson(String number, Person person);
    Person searchPerson(String number);
    void removePerson(String number);
    public abstract void show(); //public abstract jest niepotrzebny bo jest domyślny w metodach interfejsu
    int testInterface();

}
