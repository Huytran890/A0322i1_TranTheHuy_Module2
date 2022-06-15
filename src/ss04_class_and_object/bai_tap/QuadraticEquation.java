package ss04_class_and_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        if (a <= 0)
            this.a = 1.0;
        else
            this.a = a;
    }

    public void setB(double b) {
        if (b <= 0)
            this.b = 1.0;
        else
            this.b = b;
    }

    public void setC(double c) {
        if (c <= 0)
            this.c = 1.0;
        else
            this.c = c;
    }

    // ax^2 + bx + c=0;
    public void solve(double a, double b, double c) {
        double x;
        if (a == 0) {
            if (b == 0)
                System.out.println("The equation has no solution!");
            else {
                x = (-c / b);
                System.out.println("The equation has only solution x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            double x1, x2;
            if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has 2 solution is: " + "x1 = " + x1 + " and x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("The equation has 2 the same solution is " + "x1 = x2 = " + x1);
            } else
                System.out.println("The equation has no solution!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of a: ");
        double a = sc.nextDouble();
        System.out.println("Please enter the value of b: ");
        double b = sc.nextDouble();
        System.out.println("Please enter the value of c: ");
        double c = sc.nextDouble();
        QuadraticEquation s1 = new QuadraticEquation();
        s1.solve(a,b,c);

    }
}