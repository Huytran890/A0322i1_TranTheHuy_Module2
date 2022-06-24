package ss07_abstract_and_interface.bai_tap.colorable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square square = null;
        System.out.println("Enter the elementary for array Square: ");
        int n = sc.nextInt();
        Square[] squares = new Square[n];
        for (int i = 0; i < n; i++) {
            square = new Square();
            square.input();
            squares[i] = square;
        }
        for (int j = 0; j < squares.length; j++) {
            System.out.println(squares[j].toString());
            squares[j].howToColor();
            System.out.println();
        }
        System.out.println();
    }
}
