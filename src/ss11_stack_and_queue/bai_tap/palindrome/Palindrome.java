package ss11_stack_and_queue.bai_tap.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static boolean checkPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));
        }
        String s = "";
        String q = "";
        while (!stack.empty())
            s = s + stack.pop();
        while (!queue.isEmpty())
            q = q + queue.poll();
        return s.equalsIgnoreCase(q);
    }

    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        if (checkPalindrome(string))
            System.out.println("The string '" + string + "' is a symmetric string.");
        else
            System.out.println("The string '" + string + "' is not a symmetric string!");
    }
}
