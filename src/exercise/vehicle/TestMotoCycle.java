package exercise.vehicle;

import java.util.Scanner;

public class TestMotoCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MotorCycle[] motor = null;
        int choice;
        int n = 0; // length of array
        boolean flag = true;
        do {
            System.out.println("Menu!");
            System.out.println("1.Create vehicle objects and enter information \n"
                    + "2.Export tax declarations of vehicles. \n"
                    + "3.Exit!");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of vehicles you want to declare tax: ");
                    n = sc.nextInt();
                    motor = new MotorCycle[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("The car " + (i + 1));
                        motor[i] = new MotorCycle();
                        motor[i].input();
                    }
                    break;

                case 2:
                    for (int i = 0; i < n; i++) {
                        System.out.println(motor[i].toString());
                        motor[i].outputTax();
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("GOODBYE. SEE YOU AGAIN!");
                    flag = false;
                    break;

            }
        } while (flag);
    }
}
