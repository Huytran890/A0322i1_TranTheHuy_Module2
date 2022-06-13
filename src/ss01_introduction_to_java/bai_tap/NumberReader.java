package ss01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class NumberReader {
    public static void main(String[] args) {
        System.out.println("Please enter number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String message = "";
        if (num < 1000) {
            int unitHundred = num / 100;
            int unitTen = num / 10 % 10;
            int unit = num % 10 % 10;
            if (unitHundred != 0) {
                switch (unitHundred) {
                    case 1:
                        message += "One";
                        break;
                    case 2:
                        message += "Two";
                        break;
                    case 3:
                        message += "Three";
                        break;
                    case 4:
                        message += "Four";
                        break;
                    case 5:
                        message += "Five";
                        break;
                    case 6:
                        message += "Six";
                        break;
                    case 7:
                        message += "Seven";
                        break;
                    case 8:
                        message += "Eight";
                        break;
                    case 9:
                        message += "Nine";
                        break;
                }
                message += " hundreds ";
            }
            if (unitTen == 1) {
                switch (unit) {
                    case 0:
                        message += "and ten";
                        break;
                    case 1:
                        message += "and eleven";
                        break;
                    case 2:
                        message += "and twelve";
                        break;
                    case 3:
                        message += "and thirteen";
                        break;
                    case 4:
                        message += "and fourteen";
                        break;
                    case 5:
                        message += "and fifteen";
                        break;
                    case 6:
                        message += "and sixteen";
                        break;
                    case 7:
                        message += "and seventeen";
                        break;
                    case 8:
                        message += "and eighteen";
                        break;
                    case 9:
                        message += "and nineteen";
                        break;
                }
            } else {
                if (unitTen != 0) {
                    switch (unitTen) {
                        case 2:
                            message += "twen";
                            break;
                        case 3:
                            message += "thir";
                            break;
                        case 4:
                            message += "for";
                            break;
                        case 5:
                            message += "fif";
                            break;
                        case 6:
                            message += "six";
                            break;
                        case 7:
                            message += "seven";
                            break;
                        case 8:
                            message += "eight";
                            break;
                        case 9:
                            message += "nine";
                            break;
                    }
                    message += "ty ";
                }
                switch (unit) {
                    case 1:
                        message += "one";
                        break;
                    case 2:
                        message += "two";
                        break;
                    case 3:
                        message += "three";
                        break;
                    case 4:
                        message += "four";
                        break;
                    case 5:
                        message += "five";
                        break;
                    case 6:
                        message += "six";
                        break;
                    case 7:
                        message += "seven";
                        break;
                    case 8:
                        message += "eight";
                        break;
                    case 9:
                        message += "nine";
                        break;
                }
            }
        } else {
            System.out.println("out of ability");
        }
        System.out.printf("%s", message);
    }
}
