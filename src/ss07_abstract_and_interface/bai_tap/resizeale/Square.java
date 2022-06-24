package ss07_abstract_and_interface.bai_tap.resizeale;

import java.util.Scanner;

public class Square extends Shape implements Resizeable {
    private double edge;

    public Square() {
        super();
        this.edge = 1.0;
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return "A Square with Edge: "
                + getEdge()
                + ", which is a son class of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.setEdge(this.getEdge() * (1 + percent / 100));
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Enter the edge of Square: ");
        setEdge(sc.nextDouble());
    }

    public static void main(String[] args) {
//        Square square = new Square(10);
//        System.out.println("The Edge of square is: " + square.getEdge());
//        square.resize(20);
//        System.out.println("The Edge of square after changing is: " + square.getEdge());


        Square square = new Square();
        square.input();
        System.out.println(square);
    }
}
