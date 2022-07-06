package ss12_java_collection_framework.bai_tap.practice_arrayList_linkedList.controllers;

import ss12_java_collection_framework.bai_tap.practice_arrayList_linkedList.services.ProductManageImpl;

import java.util.Scanner;

public class ProductControllers {
    static int choice;
    static Scanner sc = new Scanner(System.in);
    static boolean flag = false;

    public static void showMenu() {
        System.out.println("1. Add new product");
        System.out.println("2. Update the product");
        System.out.println("3. Remove the product");
        System.out.println("4. Display the product");
        System.out.println("5. Search the product");
        System.out.println("6. Sort the product Ascending or Descending");
        System.out.println("7. Exist");
    }

    public static void main(String[] args) {
        ProductManageImpl product = new ProductManageImpl();
        System.out.println("---------- Menu ----------");
        do {
            showMenu();
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    product.addProduct();
                    break;
                case 2:
                    product.editProduct();
                    break;
                case 3:
                    product.removeProduct();
                    break;
                case 4:
                    product.showProduct();
                    break;
                case 5:
                    product.searchProductByName();
                    break;
                case 6:
                    do {
                        System.out.println("1. Sort the product ascending by price");
                        System.out.println("2. Sort the product descending by price");
                        System.out.println("3. Exist!");
                        System.out.println("Enter your choice: ");
                        choice = Integer.parseInt(sc.nextLine());
                        switch (choice) {
                            case 1:
                                product.sortProductByAscendingPrice();
                                break;
                            case 2:
                                product.sortProductByDescendingPrice();
                                break;
                            case 3:
                                flag = true;
                                break;
                            default:
                                System.out.println("Your choice is not right. Please enter again!");
                        }
                    } while (!flag);

                case 7:
                    System.out.println("GoodBye. See you again!");
                    flag = true;
                    break;
                default:
                    System.out.println("Your choice is not right. Please enter again!");
            }
        } while (!flag);
    }
}
