package ss03_array_and_methods.bai_tap;

import java.util.Scanner;

public class AddElementsIntoIndex {
    int a[];
    int n;

    // ham khoi tao
    AddElementsIntoIndex() {
        a = new int[100];
        n = 0;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter size of array: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element of array at index " + i + ":");
            a[i] = sc.nextInt();
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < n; i++)
            s = s + " " + a[i];
        return s;
    }

    public void add(int x, int index) {
        for (int i = n; i > index; i--)
            a[i] = a[i - 1];
        a[index] = x;
        n++;
    }

    public static void main(String[] args) {
        AddElementsIntoIndex arr = new AddElementsIntoIndex();
        arr.input();
        System.out.print("The array before handling is: ");
        System.out.println(arr.toString());
        int x = 2, index = 3;
        arr.add(x, index);
        System.out.print("The array after handling is: ");
        System.out.println(arr.toString());
    }

}
