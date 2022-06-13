package ss01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of money Which you want to change: ");
        usd = sc.nextDouble();
        double rate = usd * vnd;
        System.out.println("The value of VND is: " + rate);
    }
}
