package exercise.next_day;

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the date: ");
        int day = sc.nextInt();
        System.out.println("Please enter the month: ");
        int month = sc.nextInt();
        System.out.println("Please enter the year: ");
        int year = sc.nextInt();
        switch (month) {
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    if (day >= 30)
                        System.out.println("The date may not exist!");
                    else if (day <= 28)
                        System.out.println("The next day: " + (day + 1) + "\tmonth: " + month + "\tyear: " + year);
                    else
                        System.out.println("The next day: " + 1 + "\tmonth: " + (month + 1) + "\tyear: " + year);
                } else {
                    if (day >= 29)
                        System.out.println("The date may not exist!");
                    else if (day <= 27)
                        System.out.println("The next day: " + (day + 1) + "\tmonth: " + month + "\tyear: " + year);
                    else
                        System.out.println("The next day: " + 1 + "\tmonth: " + (month + 1) + "\tyear: " + year);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day >= 31)
                    System.out.println("The date may not exist!");
                else if (day <= 29)
                    System.out.println("The next day: " + (day + 1) + "\tmonth: " + month + "\tyear: " + year);
                else
                    System.out.println("The next day: " + 1 + "\tmonth: " + (month + 1) + "\tyear: " + year);
                break;
            case 12:
                if (day >= 32)
                    System.out.println("The date may not exist!");
                else if (day <= 30)
                    System.out.println("The next day: " + (day + 1) + "\tmonth: " + month + "\tyear: " + year);
                else
                    System.out.println("The next day: " + 1 + "\tmonth: " + 1 + "\tyear: " + (year + 1));
                break;
            default:
                if (day >= 32)
                    System.out.println("The date may not exist!");
                else if (day <= 30)
                    System.out.println("The next day: " + (day + 1) + "\tmonth: " + month + "\tyear: " + year);
                else
                    System.out.println("The next day: " + 1 + "\tmonth: " + (month + 1) + "\tyear: " + year);
        }
    }
}
