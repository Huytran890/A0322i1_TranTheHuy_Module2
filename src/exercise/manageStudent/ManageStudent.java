//package exercise.manageStudent;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class ArrayOfPerson {
//    Person[] a;
//    private int n;
//    Scanner sc = new Scanner(System.in);
//
//    public ArrayOfPerson() {
//        a = new Person[100];
//        this.n = 0;
//    }
//
//    public void input() {
//        int z = 0;
//        do {
//            System.out.print("Enter number elementary in array: ");
//            n = sc.nextInt();
//            z = 0;
//            System.err.print("Input wrong, enter n again!!!");
//            z = 1;
//            sc.next();
//        } while (z == 1);
//        for (int i = 0; i < n; i++) {
//            System.out.print("Enter 1-Student / 2-Professor: ");
//            int choose = sc.nextInt();
//            if (choose == 1) {
//                Person per = new Student();
//                per.input();
//                a[i] = per;
//            } else if (choose == 2) {
//                Person per = new Professor();
//                per.input();
//                a[i] = per;
//            }
//        }
//    }
//
//    public void output() {
//        System.out.println("*STUDENT*");
//        for (int i = 0; i < n; i++) {
//            if (a[i] instanceof Student)
//                System.out.println(a[i].toString());
//        }
//        System.out.println("*PROFESSOR*");
//        for (int i = 0; i < n; i++) {
//            if (a[i] instanceof Professor)
//                System.out.println(a[i].toString());
//        }
//    }
//
//    //SORT MARK FROM HIGH TO LOWEST IN STUDENT
//    public void sortMark() {
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++)
//                if (a[j] instanceof Student && a[i] instanceof Student)
//                    a[i].a
//                    if (per[i]. < a[j].getMark()) {
//                        Person tempt = a[i];
//                        a[i] = a[j];
//                        a[j] = tempt;
//                    }
//        }
//    }
//
//    //SORT RANK IN PROFESSOR
//    public void sortRank() {
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++)
//                if (a[j] instanceof Professor && a[i] instanceof Professor)
//                    if (a[i] < (proa[j].getRank()) {
//                        Person tempt = a[i];
//                        a[i] = a[j];
//                        a[j] = tempt;
//                    }
//        }
//        System.out.println("*PROFESSOR*");
//        for (int i = 0; i < n; i++) {
//            if (a[i] instanceof Professor)
//                System.out.println(a[i].toString());
//        }
//    }
//
//    //FIND MAX MARK AND MIN MARK
//    public void maxMinMark() {
//        Student[] studentList = new Student[100];
//        int s = 0;//so phan tu trong mang studentList
//        sortMark();
//        for (int i = 0; i < n; i++) {
//            if (a[i] instanceof Student) {
//                studentList[s] = (Student) a[i]; //tach mang
//                s++;
//            }
//        }
//        System.out.print("Max point: ");
//        System.out.println(studentList[0].toString());
//        System.out.print("Min point ");
//        System.out.println(studentList[s - 1].toString());
//    }
//
//    //ADD STUDENT/ PROFESSOR
//    public void add() {
//        int option;
//        do {
//            System.out.println("ADD STUDENT-1 / PROFESSOR-2/ END-3: ");
//            option = sc.nextInt();
//            if (option == 1)        //ADD STUDENT
//            {
//                Person per = new Student();
//                per.input();
//                n++;
//                a[n - 1] = per;
//            } else if (option == 2)    //ADD PROFESSOR
//            {
//                Person per = new Professor();
//                per.input();
//                n++;
//                a[n - 1] = per;
//            }
//        } while (option != 3);
//        System.out.println("END");
//    }
//
//    //FIND NAME
//    public void findName(String name) {
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (a[i] instanceof Student) {
//                if (a[i].getName().equalsIgnoreCase(name)) {
//                    System.out.print("Student: ");
//                    System.out.println(a[i].toString());
//                    count++;
//                }
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            if (a[i] instanceof Professor) {
//                if (a[i].getName().equalsIgnoreCase(name)) {
//                    System.out.print("Professor: ");
//                    System.out.println(a[i].toString());
//                    count++;
//                }
//            }
//        }
//        if (count == 0)
//            System.err.println("No exist");
//    }
//
//
//
//    //FIND Name both of professor and student
//    public void find() {
//        System.out.println("Enter the name who you want to find");
//        String name = sc.nextLine();
//        findName(name);
//        System.out.println("END");
//    }
//
//    private void delete(int index) {
//        for (int i = index; i < n; i++)
//            a[i] = a[i + 1];
//        n--;
//    }
//
//    //DELETE STU
//    public void deleteStudent(String name) {
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (a[i] instanceof Student) {
//                if (a[i].getName().equalsIgnoreCase(name)) {
//                    delete(i);
//                    count++;
//                }
//            }
//        }
//        if (count != 0)
//            System.err.println("DELETED!!");
//        else
//            System.err.println("NO EXIST");
//    }
//
//    //DELETE PRO
//    public void deleteProfessor(String name) {
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (a[i] instanceof Professor) {
//                if (a[i].getName().equalsIgnoreCase(name)) {
//                    delete(i);
//                    count++;
//                }
//            }
//        }
//        if (count != 0)
//            System.out.println("DELETED!!");
//        else
//            System.out.println("NO EXIST");
//    }
//
//    //DELETE BOTH STU AND PRO
//    public void delete() {
//        int option;
//        do {
//            System.out.println("DELETE OPTION: 1.STUDENT/ 2.PROFESSOR/ 3.EXIT: ");
//            option = sc.nextInt();
//            if (option == 1) {
//                System.out.print("Enter student name: ");
//                String name = sc.next();
//                deleteStudent(name);
//            } else if (option == 2) {
//                System.out.print("Enter professor name: ");
//                String name = sc.next();
//                deleteProfessor(name);
//            }
//        } while (option != 3);
//        System.out.println("END");
//    }
//
//    //STATIC STUDENT
//    public void staticStudent() {
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (a[i] instanceof Student)
//                count++;
//        }
//        System.out.println("There are " + count + " students");
//    }
//
//    //STATIC PROFESSOR
//    public void staticProfessor() {
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (a[i] instanceof Professor)
//                count++;
//        }
//        System.out.println("There are " + count + " professors");
//    }
//
//    //STATIC BOTH STU AND PRO
//    public void staticPer() {
//        staticStudent();
//        staticProfessor();
//    }
//
//    public static void main(String[] args) {
//        ArrayOfPerson arr = new ArrayOfPerson();
//        //		arr.staticPer();
//        //		arr.output();
//        //		arr.find();
//    }
//}
//
//
//}
