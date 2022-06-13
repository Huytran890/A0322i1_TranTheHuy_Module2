package ss02_loop_in_java.bai_tap;

import java.util.Scanner;

public class PrintPrime {

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
        int count =0;
        String s= "";
        for (int i=1; ;i++){
            if (isPrimeNumber(i)){
                s += i + " ";
                count++;
                if (count == 20) break;
            }
        }
        System.out.println("The number of digits which is Prime number is: "+s);
    }

}

