package ss11_stack_and_queue.bai_tap.reverseByStack;

import java.util.Arrays;

public class TestMyStackArray {
    // Đảo chuỗi xử dụng stack.
    public static void ReverseStringUsingStack(String str) {
        MyStackArray<Character> stackString = new MyStackArray<>(100);
        int size = str.length();
        for (int i = 0; i < size; i++) {
            stackString.push(str.charAt(i));
        }
        System.out.println("The String begging is: " + stackString.toString());
        String s = "";
        while (!stackString.isEmpty())
            s = s + stackString.pop() + " ";
        System.out.println("The String reversed is: " + s);
    }

    // Đảo mảng số nguyên xử dụng stack.
    public static void ReverseIntegerUsingStack() {
        MyStackArray<Integer> stack = new MyStackArray<Integer>(100);
        int[] myArray = {10, 20, 30, 40, 50};
        for (int i = 0; i < myArray.length; i++) {
            stack.push(myArray[i]);
        }
        int[] reverseArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            reverseArray[i] = stack.pop();
        }
        System.out.println("The Integer array reversed is :" + Arrays.toString(reverseArray));
    }

    public static void main(String[] args) {
        ReverseStringUsingStack("I love you in every universe");
        System.out.println();
        ReverseIntegerUsingStack();
    }
}


