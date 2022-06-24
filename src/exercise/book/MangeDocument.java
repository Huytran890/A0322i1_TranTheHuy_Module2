package exercise.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MangeDocument {
    static Scanner sc = new Scanner(System.in);
    static int choice;
    static boolean flag = true;
    static List<Document> documentList = new ArrayList<>();

    public static void showMenu() {
        System.out.println("MENU!");
        System.out.println("1. Enter the information for document: ");
        System.out.println("2. Display information: ");
        System.out.println("3. Search by type: ");
        System.out.println("4. Exit!");
    }

    public static void inputInformation() {
        System.out.println("Please enter the number of document: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Document document = creatDocument();
            documentList.add(document);
        }
    }

    public static Document creatDocument() {
        Document document = null;
        System.out.println("1. Enter the information about Book: ");
        System.out.println("2. Enter the information about Magazine: ");
        System.out.println("3. Enter the information about Newspaper: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                document = new Book();
                break;
            case 2:
                document = new Magazine();
                break;
            default:
                document = new Newspaper();
                break;
        }
        document.input();
        return document;
    }

    public static void showInformation() {
        System.out.println("The information which you need is");
        for (int i = 0; i < documentList.size(); i++) {
            System.out.println(documentList.get(i).toString());
        }
        System.out.println();
    }

    public static void findByType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number for choice");
        System.out.println("1. Books");
        System.out.println("2. Magazines");
        System.out.println("3. NewPapers");
        do {
            choice = sc.nextInt();
            System.out.println("The information which you are finding is");
            switch (choice) {
                case 1:
                    for (Document document : documentList) {
                        if (document instanceof Book) {
                            System.out.println(document.toString());
                        }
                    }
                    break;
                case 2:
                    for (Document document : documentList) {
                        if (document instanceof Magazine)
                            System.out.println(document.toString());
                    }
                    break;
                case 3:
                    for (Document document : documentList) {
                        if (document instanceof Newspaper)
                            System.out.println(document.toString());
                    }
                    break;
                default:
                    System.out.println("The value which you input is not illegal!");
                    flag = false;
                    break;
            }
            System.out.println();
        } while (flag);
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
                    findByType();
                    break;
                default:
                    System.out.println("GOODBYE AND SEE YOU AGAIN!");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
