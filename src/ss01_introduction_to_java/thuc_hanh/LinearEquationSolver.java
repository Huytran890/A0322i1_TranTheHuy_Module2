package ss01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class LinearEquationSolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver"); //ax+b=0;
        double s;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Please enter value of b: ");
        double b = sc.nextDouble();

        if (a != 0){
            s = (-b/a);
            System.out.println("Equation with solution x is: "+s);
        }
        else{
            if (b == 0)
                System.out.println("The equation has infinitely many solutions! ");
            else
                System.out.println("the equation has no solution! ");
        }
    }
}
