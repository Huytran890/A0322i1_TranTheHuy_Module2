package ss03_array_and_methods.bai_tap;

import java.util.Scanner;

public class CountOccurencesOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String: ");
        String str = sc.nextLine();
        System.out.println("Please enter the character which you want to count: ");
        char character = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
        // i love you in every universe;
        System.out.println("The number of character " + character + " in String " + str + " is: " + count);
    }

}
