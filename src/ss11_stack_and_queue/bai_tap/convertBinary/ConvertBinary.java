package ss11_stack_and_queue.bai_tap.convertBinary;

import java.util.Scanner;
import java.util.Stack;

public class ConvertBinary {
    public static void convertBinary(int numberBinary) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number which you want to convert: ");
        int number = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            int temp = number % numberBinary;
            stack.push(temp);
            number /= numberBinary;
        }
        System.out.print("The String after converting is: ");
        while (!stack.isEmpty()) {
            if (stack.peek() < 10)
                System.out.print(stack.pop() + " ");
            else
                System.out.print((char) (stack.pop() + 55) + " ");
        }
    }

    public static void main(String[] args) {
        convertBinary(2);
    }
}
