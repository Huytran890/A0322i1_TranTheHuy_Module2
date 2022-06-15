package ss04_class_and_object.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width <= 0)
            this.width = 1;
        else
            this.width = width;
    }

    public void setHeight(double height) {
        if (height <= 0)
            this.height = 1;
        else
            this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getCircumference() {
        return (this.width + this.width) * 2;
    }

    public String display() {
        return "Rectangle { " + "width=" + width + ", height=" + height + " }.";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the width of rectangle: ");
        double width = sc.nextDouble();
        System.out.println("Please enter the height of rectangle: ");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle \n" + rectangle.display());
        System.out.println("The circumference of rectangle is: " + rectangle.getCircumference());
        System.out.println("The area of rectangle is: " + rectangle.getArea());
    }
}
