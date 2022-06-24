package ss07_abstract_and_interface.bai_tap.resizeale;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int choice;
    static Scanner sc = new Scanner(System.in);
    static List<Shape> shapeList = new ArrayList<>();

    public static void showMenu() {
        System.out.println("MENU!");
        System.out.println("1. Enter the information for shape: ");
        System.out.println("2. Display information: ");
        System.out.println("3. Display information after increasing size: ");
        System.out.println("4. Exit!");
    }

    public static Shape creatShape() {
        Shape shape = null;
        System.out.println("1. Enter the information about Circle: ");
        System.out.println("2. Enter the information about Rectangle: ");
        System.out.println("3. Enter the information about Square: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                shape = new Circle();
                break;
            case 2:
                shape = new Rectangle();
                break;
            default:
                shape = new Square();
                break;
        }
        shape.input();
        return shape;
    }

    public static void inputInformation() {
        System.out.println("Please enter the number of shape: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Shape shape = creatShape();
            shapeList.add(shape);
        }
    }

    public static void showInformation() {
        System.out.println("The information which you need is");
        for (int i = 0; i < shapeList.size(); i++) {
            System.out.println(shapeList.get(i).toString());
        }
        System.out.println();
    }

    public static void showInformationAfterIncreasing() {
        System.out.println("The information which you need is");
        for (int i = 0; i < shapeList.size(); i++) {
            int random = (int) Math.floor(Math.random() * 100);
            shapeList.get(i).resize(random);
            System.out.println(shapeList.get(i).toString());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        boolean flag = true;
        do {
            showMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    inputInformation();
                    break;
                case 2:
                    showInformation();
                    break;
                case 3:
                    showInformationAfterIncreasing();
                    break;
                default:
                    System.out.println("GOODBYE AND SEE YOU AGAIN!");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
