package ss06_inheritance_overidding_overloading.bai_tap.triangle_and_shape;

import java.util.Scanner;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        super();
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        if (side1 <= 0)
            this.side1 = 1.0;
        else
            this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        if (side2 <= 0)
            this.side2 = 1.0;
        else
            this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        if (side3 <= 0)
            this.side3 = 1.0;
        else
            this.side3 = side3;
    }

    public boolean checkIsTriangle() {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1 || side1 < 0 || side2 < 0 || side3 < 0)
            return false;
        return true;
    }

    public double circumferenceOfTriangle() {
        if (checkIsTriangle())
            return side1 + side2 + side3;
        else
            return 0;
    }

    public double areaOfTriangle() {
        if (checkIsTriangle()) {
            double p = (side1 + side2 + side3) / 2; // nua chu vi cua tam giac.
            double s = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
            return s;
        } else
            return 0;

    }

    public void typeOfTriangle() {
        if (checkIsTriangle() == false)
            System.out.println("This is not a triangle!");
        else {
            if (side1 == side2 && side2 == side3 && side3 == side1)
                System.out.println("This is an equilateral triangle."); // deu
            else if (side1 == side2 && side1 != side3 || side1 == side3 && side1 != side2 || side2 == side3 && side2 != side1)
                System.out.println("This is an isosceles triangle."); // can
            else if (Math.pow(side1, 2) == Math.pow(side2, 2) + Math.pow(side3, 2) || Math.pow(side2, 2) == Math.pow(side1, 2) + Math.pow(side3, 2) || Math.pow(side3, 2) == Math.pow(side2, 2) + Math.pow(side1, 2))
                System.out.println("this is a right triangle."); // vuong
            else
                System.out.println("This is an ordinary triangle.");
        }
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first side of the triangle: ");
        side1 = sc.nextDouble();
        System.out.println("Please enter the second side of the triangle: ");
        side2 = sc.nextDouble();
        System.out.println("Please enter the third side of the triangle: ");
        side3 = sc.nextDouble();
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }

    @Override
    public String toString() {
        return "The three sides of the triangle is: " + getSide1() + ", " + getSide2() + ", " + getSide3()
                + ", which has a color: " + getColor() + " and " + (isFilled() ? "filled." : "not filled.") + "\n"
                + "The area of the triangle: " + this.areaOfTriangle() + "\n"
                + "The perimeter of the triangle: " + this.circumferenceOfTriangle();
    }

    public static void main(String[] args) {
        Triangle tr1 = new Triangle();
        tr1.input();
        tr1.typeOfTriangle();
        System.out.println(tr1);
    }
}
