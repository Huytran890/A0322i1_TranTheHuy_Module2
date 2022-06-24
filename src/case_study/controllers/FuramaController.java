package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    static Scanner sc = new Scanner(System.in);
    static int choice;

    public static void displayMainMenu() {
        System.out.println("MENU!");
        System.out.println("1. Employee Management: ");
        System.out.println("2. Customer Management: ");
        System.out.println("3. Facility Management: ");
        System.out.println("4. Booking Management: ");
        System.out.println("5. Promotion Management: ");
        System.out.println("6. Exit!");
    }

    public static void showEmployeeManagement() {
        System.out.println("1. Display list employees: ");
        System.out.println("2. Add new employee: ");
        System.out.println("3. Edit employee: ");
        System.out.println("4. Return main menu: ");
    }

    public static void showCustomerManagement() {
        System.out.println("1. Display list customers: ");
        System.out.println("2. Add new customer: ");
        System.out.println("3. Edit customer: ");
        System.out.println("4. Return main menu: ");
    }

    public static void showFacilityManagement() {
        System.out.println("1. Display list facility: ");
        System.out.println("2. Add new facility: ");
        System.out.println("3. Display list facility maintenance: ");
        System.out.println("4. Return main menu: ");
    }

    public static void showBookingManagerment() {
        System.out.println("1. Add new booking: ");
        System.out.println("2. Display list booking: ");
        System.out.println("3. Create new contacts: ");
        System.out.println("4. Display list contacts: ");
        System.out.println("5. Edit contacts: ");
        System.out.println("6. Return main menu: ");
    }

    public static void showPromotionManagement() {
        System.out.println("1. Display list customers use service: ");
        System.out.println("2. Display list customers get voucher: ");
        System.out.println("3. Return main menu: ");
    }


    public static void main(String[] args) {
        boolean flag = true;
        do {
            displayMainMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    showEmployeeManagement();
                    break;
                case 2:
                    showCustomerManagement();
                    break;
                case 3:
                    showFacilityManagement();
                    break;
                case 4:
                    showBookingManagerment();
                    break;
                case 5:
                    showPromotionManagement();
                    break;
                default:
                    System.out.println("GOODBYE AND SEE YOU AGAIN!");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
