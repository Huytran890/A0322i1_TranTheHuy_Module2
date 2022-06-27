package exercise.manageStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManageStudent {
    static ArrayList<Student> studentLists = new ArrayList<>();
    static int choice;
    static Scanner sc = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("1. Enter the information for Student: ");
        System.out.println("2. Display the information for Student: ");
        System.out.println("3. Display the max and min following the medium score: ");
        System.out.println("4. Search by ID: ");
        System.out.println("5. Sort A-Z following the name and display: ");
        System.out.println("6. Display students get scholarships and display sort by descending score: ");
        System.out.println("7. Exist!");
    }

    public static void main(String[] args) {
        do {
            showMenu();
            System.out.println("Choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    int n;
                    System.out.println("Please enter the number of student in List: ");
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student student = new Student();
                        student.input();
                        studentLists.add(student);
                    }
                    break;
                case 2:
                    for (int i = 0; i < studentLists.size(); i++) {
                        System.out.println(studentLists.get(i).toString());
                    }
                    break;
                case 3:
                    int minIndex = 0, maxIndex = 0;
                    double minMark, maxMark;
                    minMark = studentLists.get(0).getMark();
                    maxMark = studentLists.get(0).getMark();
                    for (int i = 0; i < studentLists.size(); i++) {
                        if (studentLists.get(i).getMark() < minMark) {
                            minIndex = i;
                            minMark = studentLists.get(i).getMark();
                        }
                        if (studentLists.get(i).getMark() > maxMark) {
                            maxIndex = i;
                            maxMark = studentLists.get(i).getMark();
                        }
                    }
                    System.out.println("The student who has the highest mark is: ");
                    System.out.println(studentLists.get(maxIndex).toString());
                    System.out.println("The student who has the lowest mark is: ");
                    System.out.println(studentLists.get(minIndex).toString());
                    break;
                case 4:
                    int count = 0;
                    System.out.println("Please enter the id's student which you need to find: ");
                    String idSearch = sc.nextLine();
                    for (Student student : studentLists) {
                        if (student.getId().equalsIgnoreCase(idSearch)) {
                            System.out.println(student.toString());
                            count++;
                        }
                    }
                    if (count == 0)
                        System.out.println("Student not found!");
                    break;
                case 5:
                    // sap xep ten sinh vien theo thu tu tu A-Z (Name)
                    Collections.sort(studentLists, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            int temp = o1.getName().compareTo(o2.getName());
                            if (temp >= 0)
                                return 1;
                            return -1;
                        }
                    });
                    // hien thi thong tin
                    for (int i = 0; i < studentLists.size(); i++) {
                        System.out.println(studentLists.get(i).toString());
                    }
                    break;
                case 6:
                    Collections.sort(studentLists, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getMark() >= o2.getMark() ? 1 : 1; // tro ve -1 de khong doi cho, tro ve 1 de doi cho.
                        }
                    });
                    // hien thi thong tin
                    for (int i = 0; i < studentLists.size(); i++) {
                        if (studentLists.get(i).checkScholarShip())
                            System.out.println(studentLists.get(i).toString());
                    }
                    break;
                case 7:
                    System.out.println("Goodbye.See you again!!!");
                    break;
                default:
                    System.out.println("Wrong Entered");
                    break;
            }
        } while (choice != 7);
    }
}
