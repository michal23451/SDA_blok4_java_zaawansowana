package day2.homework;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDatabase {
    private Student[] arrayOfStudents;
    private int arrayOfStudentsSize;
    private int counter = 0;
    private Student[] arrayOfGraduates; //absolewenci
    int counterGraduates = 0;

    public StudentDatabase(int baseSize) {
        this.arrayOfStudents = new Student[baseSize];
        this.arrayOfGraduates = new Student[baseSize];
        //System.out.println("Utworzono bazę studentów o rozmiarze: " + baseSize);
    }

    public void addStudent(Student student) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię i nazwisko: ");
        String name = scanner.nextLine();
        System.out.print("Podaj datę urodzenia w formacie dd.MM.yyyy: ");
        String birthDate = scanner.nextLine();
        System.out.print("Podaj miejscowość: ");
        String place = scanner.nextLine();
        System.out.print("Podaj ulicę i numer: ");
        String streetAndNumber = scanner.nextLine();

        student = new Student(name, birthDate, place, streetAndNumber);

        if (student.getPoints() <= 25) {
            throw new RuntimeException("Student musi mieć więcej niż 25 punktów");                   // rzucamy włanym wyjątkiem
        } else if (counter < arrayOfStudents.length) {
            arrayOfStudents[counter] = student;
            counter++;
        } else if (counter == arrayOfStudents.length) {
            System.out.println("Brak miejsca w  tablicy");
        }

        System.out.printf("W bazie pozostało %s wolnych miejsc.\n", arrayOfStudents.length - counter);
    }

    public Student getStudent(String id) {
        for (Student element : arrayOfStudents) {
            if (element.getId().toString().equals(id)) {
                return element;
            }
        }
        return null;
    }

    public void changeAddress(String id, Address address) {
        for (Student element : arrayOfStudents) {
            if (element.getId().toString().equals(id)) {
                element.setAddress(address);
            }
        }
    }

    public List<Student> getStudentsFromCity(String place) {
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < arrayOfStudents.length; i++) {
            if (arrayOfStudents[i].getAddress().getPlace().equals(place)) {
                studentList.add(arrayOfStudents[i]);
            }
        }
        return studentList;
    }

    public List<Student> getStudentsOrderByAge() {
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < arrayOfStudents.length; i++) {
            studentList.add(arrayOfStudents[i]);
        }

        Student tmp = new Student();
        for (int i = 0; i < studentList.size() - 1; i++) {
            for (int j = 0; j < studentList.size() - 1; j++) {
                if (studentList.get(j).getBirthDate().isAfter(studentList.get(j + 1).getBirthDate())) {
                    tmp = studentList.get(j);
                    studentList.set(j, studentList.get(j + 1));
                    studentList.set(j + 1, tmp);
                }
            }
        }

        return studentList;
    }

    public void punishStudents(int age, String city) {
        LocalDate sysdate = LocalDate.now();

        for (int i = 0; i < arrayOfStudents.length; i++) {
            if (arrayOfStudents[i] != null && Period.between(arrayOfStudents[i].getBirthDate(), sysdate).getYears() == age && arrayOfStudents[i].getAddress().getPlace().equals(city)) {
                arrayOfStudents[i].setPoints(arrayOfStudents[i].getPoints() - 10);
            }
        }

        for (int i = 0; i < arrayOfStudents.length; i++) {
            if (arrayOfStudents[i] != null && arrayOfStudents[i].getPoints() < 30) {
                arrayOfStudents[i] = null;
            }
        }

    }

    public void markStudentAsGraduated(String id) {
        for (Student element : arrayOfStudents) {
            if (element != null && element.getId().toString().equals(id)) {
                arrayOfGraduates[counterGraduates] = element;
                counterGraduates++;
            }
        }
    }

    public List<Student> getActiveStudents() {
        List<Student> activeStudentsList = new ArrayList<>();
        boolean check = false;
        for (int i = 0; i < arrayOfStudents.length; i++) {
            for (int j = 0; j < arrayOfGraduates.length; j++) {
                if (arrayOfStudents[i] != null && arrayOfGraduates[j] != null && arrayOfStudents[i].getId().equals(arrayOfGraduates[j].getId())) {
                    check = true;
                    break;
                } else {
                    check = false;
                }
            }
            if (check == false) {
                activeStudentsList.add(arrayOfStudents[i]);
            }
        }
        return activeStudentsList;
    }

    /*
     *
     *
     *   dodatkowe metody
     *
     *
     */

    //szybsza metoda do testowego uzupełnienia tablicy bez Scannera
    public void addStudent(Student student, String name, String birthDate, String place, String streetAndNumber) {
        student = new Student(name, birthDate, place, streetAndNumber);

        if (student.getPoints() <= 25) {
            System.out.println("Liczba punktów studenta: " + student.getPoints());
            throw new RuntimeException("Student musi mieć więcej niż 25 punktów");                   // rzucamy włanym wyjątkiem
        } else if (counter < arrayOfStudents.length) {
            arrayOfStudents[counter] = student;
            counter++;
        } else if (counter == arrayOfStudents.length) {
            System.out.println("Brak miejsca w  tablicy");
        }

        //System.out.printf("W bazie pozostało %s wolnych miejsc.\n", arrayOfStudentsSize - counter);
    }

    public static void printArray(Student[] input) {
        for (Student element : input) {
            if (element != null) {
                System.out.println(element);
            }
        }
    }

    public static void printList(List<Student> input) {
        for (Student element : input) {
            if (element != null) {
                System.out.println(element);
            }
        }
    }

    public Student[] getArrayOfStudents() {
        return arrayOfStudents;
    }

    public Student[] getArrayOfGraduates() {
        return arrayOfGraduates;
    }

}
