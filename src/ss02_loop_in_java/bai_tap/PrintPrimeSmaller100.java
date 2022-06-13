package ss02_loop_in_java.bai_tap;

import java.util.Scanner;

public class PrintPrimeSmaller100 {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of digits which you want to show: ");
        int n = sc.nextInt();
        System.out.printf("All primes less than %d is: \n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i += 2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }
}

