package ss07_abstract_and_interface.bai_tap.colorable;

import java.util.Scanner;

public class Square implements Colorable {
    private boolean colorable;
    public double side;
    public String color;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, double side, boolean colorable) {
        this.color = color;
        this.side = side;
        this.colorable = colorable;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isColorable() {
        return colorable;
    }

    public void setColorable(boolean colorable) {
        this.colorable = colorable;
    }

    public double getArea() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square {" +
                "colorable: " + colorable +
                ", side: " + side +
                ", color: '" + color +
                ", and An area of square is: " + getArea() + '\'' +
                "}.";
    }

    @Override
    public void howToColor() {
        if (this.colorable) {
            System.out.print("Color all four sides.");
            System.out.println();
        } else {
            System.out.println("The color just on 1 side.");
            System.out.println();
        }
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the status of color for Square: ");
        colorable = sc.nextBoolean();
        System.out.println("Enter the side of Square: ");
        side = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the color of Square: ");
        color = sc.nextLine();
        setSide(side);
    }

}