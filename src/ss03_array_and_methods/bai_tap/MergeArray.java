package ss03_array_and_methods.bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        int[] arr2 = new int[3];
        int size = arr1.length + arr2.length;
        int[] arr3 = new int[size];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the elements in the first array");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Please enter the elements " + (i + 1) + " for the first array: ");
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Please enter the elements in the second array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Please enter the elements " + (i + 1) + " for the second array: ");
            arr2[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }

        System.out.print("The array after merging is:  ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
    }
}
