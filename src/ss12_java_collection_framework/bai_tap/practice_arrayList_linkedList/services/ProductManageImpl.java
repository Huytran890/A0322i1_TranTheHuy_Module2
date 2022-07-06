package ss12_java_collection_framework.bai_tap.practice_arrayList_linkedList.services;


import ss12_java_collection_framework.bai_tap.ComparatorByHigher;
import ss12_java_collection_framework.bai_tap.ComparatorByLower;
import ss12_java_collection_framework.bai_tap.practice_arrayList_linkedList.models.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManageImpl implements ProductManage {
    static Scanner sc = new Scanner(System.in);
    static List<Product> productList = new ArrayList<>();
    static boolean check = false;

    public void addProduct() {
        Product product = new Product();
        productList.add(product.input());
    }

    public void editProduct() {
        System.out.println("Enter the id which you want to edit: ");
        String id = sc.nextLine();
        for (Product item : productList) {
            if (item.getId().equals(id)) {
                check = true;
                System.out.println("Enter the name which you want to edit: ");
                String newName = sc.nextLine();
                item.setName(newName);

                System.out.println("Enter the price which you want to edit: ");
                float newPrice = Float.parseFloat(sc.nextLine());
                item.setPrice(newPrice);

                System.out.println("Enter the quantity which you want to edit: ");
                int newQuantity = Integer.parseInt(sc.nextLine());
                item.setQuantity(newQuantity);

                System.out.println("Enter the producer which you want to edit: ");
                String newProducer = sc.nextLine();
                item.setProducer(newProducer);
            }
        }
        if (check)
            System.out.println("Updated");
        else
            System.out.println("The ID which you inputting is not exist!");
    }

    public void removeProduct() {
        System.out.println("Enter the id's product which you want to remove: ");
        String id = sc.nextLine();
        for (Product item : productList) {
            if (item.getId().equals(id)) {
                productList.remove(item);
                check = true;
            }
        }
        if (check)
            System.out.println("Deleted");
        else
            System.out.println("The ID which you inputting is not exist!");
    }

    public void showProduct() {
        for (Product product : productList) {
            if (product != null)
                System.out.println(product.toString());
        }
    }

    public void searchProductByName() {
        System.out.println("Enter the name which you want to find: ");
        String name = sc.nextLine();
        for (Product product : productList) {
            if (product != null && product.getName().contains(name)) {
                System.out.println(product);
                check = true;
            }
        }
        if (check)
            System.out.println("-----The name: " + name + " is exist-----");
        else
            System.out.println("-----The name: " + name + " is not exist!-----");
    }

    public void sortProductByAscendingPrice() {
        Collections.sort(productList, new ComparatorByHigher());
        for (int i = 0; i < productList.size(); i++)
            System.out.println(productList.get(i).toString());
    }

    public void sortProductByDescendingPrice() {
        Collections.sort(productList, new ComparatorByLower());
        for (int i = 0; i < productList.size(); i++)
            System.out.println(productList.get(i).toString());
    }
}
