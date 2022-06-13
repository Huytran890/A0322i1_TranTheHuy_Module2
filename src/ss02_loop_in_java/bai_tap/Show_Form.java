package ss02_loop_in_java.bai_tap;

import java.util.Scanner;

public class Show_Form {
    public static void printTriangle1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of triangle in bottom-left: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void printTriangle2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of Triangle in top-left: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            for (int j=n; j>i; j--)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void printSquare(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the height of Square: ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++){
            for (int j=0; j<(n*2+1); j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the Square");
            System.out.println("2. Draw the Triangle in bottom-left");
            System.out.println("3. Draw the Triangle in top-left");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the Square");
                    printSquare();
                    break;
                case 2:
                    System.out.println("Draw the Triangle in bottom-left");
                    printTriangle1();
                    break;
                case 3:
                    System.out.println("Draw the Triangle in top-left");
                    printTriangle2();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
