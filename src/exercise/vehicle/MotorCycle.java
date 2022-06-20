package exercise.vehicle;

import java.util.Scanner;

public class MotorCycle {
    private String name;
    private String color;
    private int cylinderCapacity;
    private int price;

    public MotorCycle() {
        this("Dream", "Red black", 50, 5000000);
    }

    public MotorCycle(String name, String color, int cylinderCapacity, int price) {
        this.name = name;
        this.color = color;
        this.cylinderCapacity = cylinderCapacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        if (cylinderCapacity <= 0)
            this.cylinderCapacity = 50;
        else
            this.cylinderCapacity = cylinderCapacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0)
            this.price = 1000000;
        else
            this.price = price;
    }

    public double impost() {
        double tax = 0;
        if (cylinderCapacity < 100)
            tax = price * 0.01;
        if (cylinderCapacity >= 100 && cylinderCapacity <= 200)
            tax = price * 0.03;
        if (cylinderCapacity > 200)
            tax = price * 0.05;
        return tax;
    }

    @Override
    public String toString() {
        return "MotorCycle { " + "name = '" + name + '\'' +
                ", color = '" + color + '\'' +
                ", cylinderCapacity = " + cylinderCapacity +
                ", price = " + price +
                " }";
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of motorbikes: ");
        name = sc.nextLine();
        System.out.println("Please enter the color of motorbikes: ");
//        sc.nextInt();
        color = sc.nextLine();
        System.out.println("Please enter the cylinder capacity of motorbikes: ");
        cylinderCapacity = sc.nextInt();
        System.out.println("Please enter the price of motorbikes: ");
        price = sc.nextInt();
        setCylinderCapacity(cylinderCapacity);
        setPrice(price);
    }

    public void outputTax() {
        System.out.println("The tax for " + getName() + " is: " + impost());
    }

}
