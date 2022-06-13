package ss03_array_and_methods.bai_tap;

import java.util.Scanner;

public class SumInColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of columns in the 2D array: ");
        int column = scanner.nextInt();
        System.out.println("Please enter the number of row in the 2D array: ");
        int row = scanner.nextInt();
        int[][] myArr = new int[column][row];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("please enter the element in column " + (i + 1) + " and in row " + (j + 1) + ": ");
                myArr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The 2D array is: ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(myArr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("you want to calculate the sum of column: ");
        int index = scanner.nextInt();
        int sum = 0;
        if (index <= myArr[0].length) {
            for (int i = 0; i < column; i++) {
                for (int j = 0; j < row; j++) {
                    if (j == index - 1) {
                        sum += myArr[i][j];
                    }
                }
            }
            System.out.println("The sum of values in column " + index + " ​​in the 2D array is: " + sum);
        } else {
            System.out.println("The column you entered does not exist!");
        }
    }
}
