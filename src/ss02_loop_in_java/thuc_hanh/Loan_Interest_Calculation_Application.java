package ss02_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class Loan_Interest_Calculation_Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the money which you want to borrow: ");
        double money = sc.nextDouble();
        System.out.println("Please enter the month: ");
        int month = sc.nextInt();
        System.out.println("Please enter the interest rate: ");
        double interestRate = sc.nextDouble();
        double totalInterest = 0;
        totalInterest += money * (interestRate / 100) / 12 * month;
        System.out.println("Total of interest: " + totalInterest);


    }
}
