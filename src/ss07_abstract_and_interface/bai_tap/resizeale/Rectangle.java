package ss07_abstract_and_interface.bai_tap.resizeale;

import java.util.Scanner;

public class Rectangle extends Shape implements Resizeable {
    private double width;
    private double length;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0)
            this.width = 1.0;
        else
            this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0)
            this.length = 1.0;
        else
            this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width: "
                + getWidth()
                + " and length: "
                + getLength()
                + ", which is a son class of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.length = this.length * (1 + percent / 100);
        this.width = this.width * (1 + percent / 100);
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Enter the width of rectangle: ");
        setWidth(sc.nextDouble());
        System.out.println("Enter the length of rectangle: ");
        setLength(sc.nextDouble());
    }

    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(10, 20);
//        System.out.println("The width of rectangle is: " + rectangle.getWidth());
//        System.out.println("The length of rectangle is: " + rectangle.getLength());
//        rectangle.resize(20);
//        System.out.println();
//        System.out.println("The width of rectangle after changing is: " + rectangle.getWidth());
//        System.out.println("The length of rectangle after changing is: " + rectangle.getLength());

        Rectangle rectangle1 = new Rectangle();
        rectangle1.input();
        System.out.println(rectangle1);
    }

}
