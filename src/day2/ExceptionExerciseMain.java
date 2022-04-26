package day2;

import day2.utils.StringHelper;

public class ExceptionExerciseMain {

    public static void main(String[] args) {
        int value = StringHelper.parseToInt("10");
        System.out.println(value);

        int wrongValue = StringHelper.parseToInt("abc");
        System.out.println(wrongValue);

        System.out.println("---");

        try {
            String finalSalary = StringHelper.calculateSalary(11, 0);
            System.out.println(finalSalary);

            StringHelper.calculateSalary(11, -50);
        } catch (Exception e) {
            System.out.println("Coś poszło nie tak: " + e.getMessage());
        }
    }
}
