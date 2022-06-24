package ss07_abstract_and_interface.bai_tap.resizeale;

import java.util.Scanner;

public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius: "
                + getRadius()
                + ", which is a son class of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius * (1 + percent / 100);
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Enter the radius of circle: ");
        setRadius(sc.nextDouble());
    }

    public static void main(String[] args) {
//        Circle circle = new Circle(5);
//        System.out.println(circle.getArea());
//        circle.resize(20);
//        System.out.println(circle.getRadius());
//        System.out.println(circle.getArea());

        Circle circle1 = new Circle();
        circle1.input();
        System.out.println(circle1);
    }
}
