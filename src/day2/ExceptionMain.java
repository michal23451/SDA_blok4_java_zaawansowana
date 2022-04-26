package day2;

import day2.utils.StringHelper;

public class ExceptionMain {

    public static void main(String[] args) {
        System.out.println(StringHelper.parseToInt("1"));
        System.out.println(StringHelper.parseToInt("1a"));

        System.out.println();

        System.out.println(StringHelper.calculateSalary(100, 20));
        System.out.println(StringHelper.calculateSalary(100, -200));

        try {
            doSomething(10);
        } catch (Exception e) {
            System.out.println("Coś poszło nie tak " + e.getMessage());
        }
    }

    private static void doSomething(int age) throws Exception { // metoda doSomething potencjalnie rzuca wyjątek dziedziczący po Exception - należy ją obsłużyć
        if (age < 0) {
            throw new IllegalArgumentException("Wiek nie moze byc ujemny"); // ten wyjątek dziedziczy po RuntimeException, więc nie musimy go obsługiwać
        }

        if (age < 0) {
            throw new Exception("Wiek nie moze byc ujemny");    // wyjątki dziedziczące po Exception musimy obsłużyć - zamykając w strukturze try-catch
            // lub delegująć obsługę do klienta metody (zmiana w sygnaturze metody doSomething)
        }
    }
}
