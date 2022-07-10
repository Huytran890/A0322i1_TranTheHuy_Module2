package ss13_search_algorithm.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class Find_maximum_Subsequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = input.nextLine();

        LinkedList<Character> list = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> tempList = new LinkedList<>();
            tempList.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > tempList.getLast()) {
                    tempList.add(string.charAt(j));
                }
            }
            if (tempList.size() > list.size()) {
                list.clear();
                list.addAll(tempList);
            }
            tempList.clear();
        }

        for (Character ch : list) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
