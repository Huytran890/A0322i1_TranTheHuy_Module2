package ss03_array_and_methods.bai_tap;

import java.util.Scanner;

public class RemoveValueInArray {
    public static void main(String[] args) {
        int numbers[] = new int[]{10, 4, 5, 6, 30};
        int n = numbers.length;
        System.out.println("The Number array before handling is: ");
        for (int i = 0; i < n; i++) {
            int a = numbers[i];
            System.out.print(a + "\t");
        }
        int index = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value which you want to remove: ");
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (numbers[i] == x) {
                index = i;
                System.out.println("The value you want to delete is in the th position: " + (i + 1));
            }
        }
        if (index == -1) {
            System.out.println("There are no elements in the array that have a value of: " + x);
        } else {
            for (int i = index; i < n - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[n - 1] = 0;
        }
        System.out.println("The array after handling is: ");
        for (int j = 0; j < n; j++) {
            int a = numbers[j];
            System.out.print(a + "\t");
        }
    }
}
