package ss01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class UseTheOperator {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);//Khai báo đối tượng Scanner

        System.out.print("Enter width: ");
        width = scanner.nextFloat();//Nhập chiều rộng
        System.out.print("Enter height: ");
        height = scanner.nextFloat();//Nhập chiều dài
        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
