package ss12_java_collection_framework.bai_tap.practice_arrayList_linkedList.models;

import java.util.Scanner;

public class Product {
    private String id;
    private String name;
    private float price;
    private int quantity;
    private String Producer;

    public Product() {

    }

    public Product(String id, String name, float price, int quantity, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        Producer = producer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String producer) {
        Producer = producer;
    }

    @Override
    public String toString() {
        return "Product {" +
                "id: '" + id + '\'' +
                ", name: '" + name + '\'' +
                ", price: " + price +
                ", quantity: " + quantity +
                ", Producer: '" + Producer + '\'' +
                "}.";
    }

    public Product input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product's id: ");
        String id = sc.nextLine();
        System.out.println("Enter the product's name: ");
        String name = sc.nextLine();
        System.out.println("Enter the product's price: ");
        float price = Float.parseFloat(sc.nextLine());
        System.out.println("Enter the product's quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the producer: ");
        String producer = sc.nextLine();
        Product product = new Product(id,name,price,quantity,producer);
        return product;
    }


}
