package exercise.bank_account_management;

import java.text.NumberFormat;
import java.util.Scanner;

public class Account {
    private long accountNumber;
    private String accountName;
    private int amountOfMoney;
    public static final double bankRate = 0.5;

    public Account() {
        this(0, null, 0);
    }

    public Account(long accountNumber, String accountName, int amountOfMoney) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.amountOfMoney = amountOfMoney;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        if (accountNumber < 0)
            this.accountNumber = 0;
        else
            this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        if (amountOfMoney < 0)
            this.amountOfMoney = 0;
        else
            this.amountOfMoney = amountOfMoney;
    }

    @Override
    public String toString() {
        NumberFormat currentFormat = NumberFormat.getCurrencyInstance();
        String str = currentFormat.format(amountOfMoney);
        return "Account { " +
                "accountNumber = " + accountNumber +
                ", accountName = '" + accountName + '\'' +
                ", amountOfMoney = " + str +
                " }";
    }

    Scanner sc = new Scanner(System.in);

    public int deposit() {
        int deposit;
        System.out.println("Please enter the amount you need to deposit into your account: ");
        deposit = sc.nextInt();
        if (deposit >= 0)
            amountOfMoney += deposit;
        else
            System.out.println("");
//            System.out.println("The amount which you entered is not illegal!");
        return amountOfMoney;
    }

    public int withdraw() {
        int withDraw;
        double fee = 12000;
        System.out.println("Please enter the amount you need to withdraw into your account: ");
        withDraw = sc.nextInt();
        if (withDraw > 0) {
            if (withDraw <= (amountOfMoney - fee))
                amountOfMoney -= (withDraw + fee);
            else {
                System.out.println("Your account balance is not enough!");
                return 0;
            }
        } else
            System.out.println("The amount which you entered is not illegal!");
        return amountOfMoney;
    }

    public int maturity() {
        NumberFormat currentFormat = NumberFormat.getCurrencyInstance();
        String str = currentFormat.format(amountOfMoney);
        System.out.println("The amount in your current account is: " + str + " and it's due 1 month.");
        return amountOfMoney += (amountOfMoney * bankRate);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your bank account name: ");
        accountName = sc.nextLine();
        System.out.println("PLease enter your bank account number: ");
        accountNumber = sc.nextLong();
        System.out.println("Please enter the amount in your account: ");
        amountOfMoney = sc.nextInt();
        setAccountNumber(accountNumber);
        setAmountOfMoney(amountOfMoney);
    }

}
