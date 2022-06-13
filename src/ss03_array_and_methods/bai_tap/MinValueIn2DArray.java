package ss03_array_and_methods.bai_tap;

import java.util.Scanner;

public class MinValueIn2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] myArray = new int[2][5];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Enter a value for the row elements " + (i + 1) + " columns " + (j + 1) + " : ");
                myArray[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The imported 2-D array is: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }

        int min = myArray[0][0];
        for (int i = 0; i < 2; i ++) {
            for (int j = 0; j < 5; j++) {
                if (min > myArray[i][j]){
                    min = myArray[i][j];
                }
            }
        }
        System.out.println("The smallest element in the 2D array is: " + min);
    }
}
