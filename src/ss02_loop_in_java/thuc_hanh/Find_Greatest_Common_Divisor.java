package ss02_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class Find_Greatest_Common_Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number a: ");
        int a = sc.nextInt();
        System.out.println("Please enter number b: ");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b== 0)
            System.out.println("No greatest common factor! ");
        else{
            while (a != b){
                if (a > b)
                    a = a-b;
                else
                    b = b-a;
            }
            System.out.println("Greatest common factor: " + a);
        }
    }
}
