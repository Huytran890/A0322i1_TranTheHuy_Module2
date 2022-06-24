package ss07_abstract_and_interface.bai_tap.resizeale;

import java.util.Scanner;

public abstract class Shape implements Resizeable {
    private String color;
    private boolean filled;

    public Shape() {
        this("Red", true);
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "The shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the color of shape: ");
        color = sc.nextLine();
        System.out.println("Enter the filled of shape: ");
        filled = sc.nextBoolean();
    }
}
