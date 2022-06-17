package ss06_inheritance_overidding_overloading.bai_tap.cylinder_and_circle;

import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;
    public final double PI = 3.14;

    public Circle() {
        this(1.0, "White");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0)
            this.radius = 1.0;
        else
            this.radius = radius;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        System.out.print("PLease enter the radius of circle: ");
        radius = sc.nextDouble();
        System.out.print("PLease enter the color of circle: ");
        sc.nextLine();
        color = sc.nextLine();
        setRadius(radius);
        setColor(color);
    }

    public double area() {
        double s = this.radius * this.radius * PI;
        return s;
    }

    public double circumference() {
        double c = this.radius * 2 * PI;
        return c;
    }

    @Override
    public String toString() {
        return "The circle has radius = " + getRadius() + " and the color is: " + getColor() + "\n"
                + "The area of circle is: " + area() + "\n"
                + "The circumference of circle is: " + circumference();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.input();
        System.out.println(circle.toString());
    }
}
