package ss03_array_and_methods.bai_tap;

import java.util.Scanner;

public class DiagonalIn2DArray {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số bậc của ma trận: ");
            n = scanner.nextInt();
        } while (n < 1);

        int[][] A = new int[n][n];

        System.out.println("Nhập các phần tử cho ma trận A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận A vừa nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    sum += A[i][j];
            }
        }
        System.out.println("The sum of values of the elements in the main diagonal in the 2D array is: " + sum);
    }
}
