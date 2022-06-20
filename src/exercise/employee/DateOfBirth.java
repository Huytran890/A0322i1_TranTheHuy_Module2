package exercise.employee;

import java.util.Scanner;

public class DateOfBirth {
    private int day, month, year;

    public DateOfBirth() {
        this(1, 1, 1900);
    }

    public DateOfBirth(int day, int month, int year) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 0 || day > numberOfDay())
            day = 1;
        else
            this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 0 || month > 12)
            month = 1;
        else
            this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0 || year > 5000)
            year = 1900;
        else
            this.year = year;
    }

    public int numberOfDay() {
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        else if (month == 2)
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                return 29;
            else return 28;
        else
            return 31;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        day = sc.nextInt();
        System.out.println("Enter month: ");
        month = sc.nextInt();
        System.out.println("Enter year: ");
        year = sc.nextInt();
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public String toString() {
        return this.getDay() + "/" + this.getMonth() + "/" + this.getYear();
    }

    public static void main(String[] args) {
        DateOfBirth dateOfBirth = new DateOfBirth();
        dateOfBirth.setYear(6000);
        dateOfBirth.setMonth(72);
        dateOfBirth.setDay(12);
        System.out.println(dateOfBirth.toString());

        DateOfBirth dateOfBirth1 = new DateOfBirth();
        dateOfBirth1.input();
        System.out.println(dateOfBirth1.toString());
    }
}
