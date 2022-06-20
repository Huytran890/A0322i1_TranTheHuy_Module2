package exercise.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageCadres {
    static Scanner sc = new Scanner(System.in);
    static int choice;
    static List<Cadres> cadresList = new ArrayList<>();

    public static void showMenu() {
        System.out.println("MENU!");
        System.out.println("1. Enter the information for cadres: ");
        System.out.println("2. Display information: ");
        System.out.println("3. Search by name: ");
        System.out.println("4. Exit!");
    }

    public static void inputInformation() {
        System.out.println("Please enter the number of cadres: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Cadres cadres = creatCadres();
            cadresList.add(cadres);
        }
    }

    public static Cadres creatCadres() {
        Cadres cadres = null;
        System.out.println("1. Enter the information about Worker: ");
        System.out.println("2. Enter the information about Engineer: ");
        System.out.println("3. Enter the information about Staff: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                cadres = new Worker();
                break;
            case 2:
                cadres = new Engineer();
                break;
            default:
                cadres = new Staff();
                break;
        }
        cadres.input();
        return cadres;
    }

    public static void showInformation() {
        System.out.println("The information which you need is");
        for (int i = 0; i < cadresList.size(); i++) {
            System.out.println(cadresList.get(i).toString());
        }
        System.out.println();
    }

    public static void searchByName() {
        System.out.println("The name which you need to find is");
        System.out.println("Please enter the name's cadres who you need to find: ");
        sc.nextLine();
        String name = sc.nextLine();
        for (int i = 0; i < cadresList.size(); i++) {
            if (cadresList.get(i).getName().equalsIgnoreCase(name))
                System.out.println(cadresList.get(i).toString());
        }
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
                    searchByName();
                    break;
                default:
                    System.out.println("GOODBYE AND SEE YOU AGAIN!");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
