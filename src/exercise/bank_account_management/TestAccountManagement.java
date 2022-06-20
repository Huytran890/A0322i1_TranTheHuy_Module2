package exercise.bank_account_management;

import java.util.Scanner;

public class TestAccountManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account[] account = null;
        int choice, n = 0; // length of array Account
        long input, accountExist;
        boolean flag = true;

        do {
            System.out.println("MENU!");
            System.out.println("1.Input customer information. \n"
                    + "2.Export information list of customers. \n"
                    + "3.Deposit. \n"
                    + "4.Withdraw. \n"
                    + "5.Maturity. \n"
                    + "6.Transfer. \n"
                    + "7.Exit!");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter the number of customers: ");
                    n = sc.nextInt();
                    account = new Account[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("The customer " + (i + 1));
                        account[i] = new Account();
                        account[i].input();
                    }
                    break;

                case 2:
                    System.out.println("The list information of customers are:");
                    for (int i = 0; i < n; i++) {
                        String str = account[i].toString();
                        System.out.println(str);
                    }
                    break;

                case 3:
                    System.out.println("Please enter the account which you need to top up: ");
                    input = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        accountExist = account[i].getAccountNumber();
                        if (input == accountExist) {
                            System.out.println("The account which you will top up is: " + accountExist);
                            int temp = account[i].deposit();
                            System.out.println("The amount after topping up into your account is: " + temp);
                        } else
                            System.out.println("The account which you need top up is not illegal!");
                    }
                    break;

                case 4:
                    System.out.println("Please enter the account which you need to withdraw money: ");
                    input = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        accountExist = account[i].getAccountNumber();
                        if (input == accountExist) {
                            System.out.println("The account which you will withdraw money is: " + accountExist);
                            if (account[i].withdraw() == 0) {
                                break;
                            } else {
                                int temp = account[i].withdraw();
                                System.out.println("The amount after withdrawing from the account is: " + temp);
                            }
                        } else
                            System.out.println("The account which you need withdraw money is not illegal!");
                    }
                    break;

                case 5:
                    System.out.println("Please enter the customer account number to be due: ");
                    input = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        accountExist = account[i].getAccountNumber();
                        if (input == accountExist) {
                            System.out.println("The account which you will be due is: " + accountExist);
                            int temp = account[i].maturity();
                            System.out.println("the amount after 1 month maturity in your account is: " + temp);
                        } else
                            System.out.println("The account which you need to due is not illegal!");
                    }
                    break;

                default:
                    System.out.println("GOODBYE AND SEE YOU AGAIN!");
                    flag = false;
                    break;
            }
            System.out.println();
        } while (flag);
    }
}
