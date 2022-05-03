package day2.homework;

import java.util.Scanner;

import static day2.homework.StudentDatabase.*;

public class HighSchoolMain {
    public static void main(String[] args) {
        StudentDatabase base = new StudentDatabase(15);
        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n\n********MENU**********");
            System.out.println("Przed pierwszym wykonaniem metod należy skorzystać z opcji nr 1. Podaj co chcesz zrobić:\n" +
                    "0 - wyjść z programu\n" +
                    "1 - uzupełnij bazę testowymi danymi\n" +
                    "2 - wyświetl bazę\n" +
                    "3 - metoda getStudent(String id)\n" +
                    "4 - metoda void changeAddress(id, address)\n" +
                    "5 - metoda List<Student> getStudentsFromCity(miejscowość)\n" +
                    "6 - metoda List<Student> getStudentsOrderedByAge()\n" +
                    "7 - metoda void punishStudents(age, city) - obniża ilość punktów o 10 dla studentów spełniających kryteria i usuwa z bazy tych co mają mniej niż 30 punktów\n" +
                    "8 - metoda void markStudentAsGraduated(id)\n" +
                    "9 - metoda List<Student> getActiveStudents()");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 0:
                    System.out.println("KONIEC");
                    scanner.close();
                    break;
                case 1:
                    Student tmp = new Student();
                    base.addStudent(tmp, "Jan Kowalski", "22.05.1990", "Katowice", "Katowicka 1");
                    base.addStudent(tmp, "Adam Nowak", "01.07.1993", "Warszawa", "Warszawska 2");
                    base.addStudent(tmp, "Andrzej Wiśniewski", "05.09.1991", "Opole", "Opolska 3");
                    base.addStudent(tmp, "Patrycja Wójcik", "11.12.1993", "Warszawa", "Warszawska 4");
                    base.addStudent(tmp, "Anna Kowalczyk", "14.01.1991", "Gdańsk", "Gdańska 5");
                    base.addStudent(tmp, "Piotr Lewandowski", "01.03.1993", "Katowice", "Katowicka 6");
                    base.addStudent(tmp, "Wojciech Kwiatkowski", "15.10.1989", "Katowice", "Katowicka 7");
                    base.addStudent(tmp, "Katarzyna Krawczyk", "05.04.1985", "Warszawa", "Warszawska 8");
                    base.addStudent(tmp, "Tomasz Piotrowski", "29.09.1995", "Katowice", "Katowicka 9");
                    base.addStudent(tmp, "Paweł Wojciechowski", "20.01.1990", "Gdańsk", "Gdańska 10");
                    base.addStudent(tmp, "Stefan Adamski", "11.12.1993", "Opole", "Opolska 11");
                    base.addStudent(tmp, "Barbara Mazur", "02.02.1980", "Warszawa", "Warszawska 12");
                    base.addStudent(tmp, "Dominik Pawlak", "25.05.1990", "Katowice", "Katowicka 13");
                    base.addStudent(tmp, "Sławomir Malinowski", "15.01.1996", "Gdańsk", "Gdańska 14");
                    base.addStudent(tmp, "Marta Dudek", "14.07.1989", "Opole", "Opolska 15");
                    base.addStudent(tmp, "test", "11.11.1111", "111", "1111"); //brak miejsca w tablicy
                    break;
                case 2:
                    printArray(base.getArrayOfStudents());
                    break;
                case 3:
                    System.out.print("Podaj id studenta: ");
                    System.out.println(base.getStudent(scanner.nextLine()));
                    break;
                case 4:
                    System.out.print("Podaj id studenta: ");
                    String id = scanner.nextLine();
                    System.out.print("Podaj miasto: ");
                    String place = scanner.nextLine();
                    System.out.print("Podaj ulicę: ");
                    String street = scanner.nextLine();
                    base.changeAddress(id, new Address(place, street));
                    break;
                case 5:
                    System.out.println("Podaj miejscowość: ");
                    printList(base.getStudentsFromCity(scanner.nextLine()));
                    break;
                case 6:
                    printList(base.getStudentsOrderByAge());
                    break;
                case 7:
                    System.out.print("Podaj wiek: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Podaj miejscowość: ");
                    String city = scanner.nextLine();
                    base.punishStudents(age, city);
                    break;
                case 8:
                    System.out.print("Podaj id: ");
                    base.markStudentAsGraduated(scanner.nextLine());
                    printArray(base.getArrayOfGraduates());
                    break;
                case 9:
                    printList(base.getActiveStudents());
                    break;
                default:
                    System.out.print("Niepoprawny wybór!");
            }

        } while (menu != 0);
    }
}
