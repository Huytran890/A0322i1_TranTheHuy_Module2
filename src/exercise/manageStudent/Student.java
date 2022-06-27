package exercise.manageStudent;

import java.util.Scanner;

public class Student extends Person {
    private String id;
    private double mark;
    private String email;

    public Student() {
    }

    public Student(String name, String phoneNumber, DateOfBirth dateOfBirth, Address address, String id, double mark, String email) {
        super(name, phoneNumber, dateOfBirth, address);
        this.id = id;
        this.mark = mark;
        this.email = email;
    }

    public double getMark() {
        return mark;
    }

    public boolean setMark(double mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;
            return true;
        } else {
            System.out.println("Invalid value. Please enter the mark again (mark >=0 && mark < 10)!");
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email != null && email.contains("@gmail.com") && !email.contains(" ")) { // email phai co ky tu @ va khong duoc co ky tu trang.
            this.email = email;
            return true;
        } else {
            System.out.println("Invalid value. Please enter the email again!");
            return false;
        }
    }

    public String getId() {
        return id;
    }

    public boolean setId(String id) {
        if (id != null && id.length() == 8) {  // ma sinh vien phai co 8 ky tu.
            this.id = id;
            return true;
        } else {
            System.out.println("Invalid value. Please enter the id again (length : 8 symbols)!");
            return false;
        }
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID's student: ");
        while (true) {
            String idInput = sc.nextLine();
            boolean check = setId(idInput);
            if (check)
                break;
        }
        System.out.println("Enter the Mark's student: ");
        while (true) {
            double markInput = Double.parseDouble(sc.nextLine());
            boolean check = setMark(markInput);
            if (check)
                break;
        }
        System.out.println("Enter the Email's student: ");
        while (true) {
            String emailInput = sc.nextLine();
            boolean check = setEmail(emailInput);
            if (check)
                break;
        }
    }

    public boolean checkScholarShip() {
        if (mark >= 8) {
            System.out.println("You got a scholarship for next term. Congratulation.");
            return true;
        } else {
            System.out.println("You didn't get a scholarship for next term! \n" + "GOOD LUCK NEXT TERM.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student {" +
                "id: " + getId() +
                ", mark: " + getMark() +
                ", email: '" + getEmail() + '\'' +
                ", name: '" + getName() + '\'' +
                ", phoneNumber: '" + getPhoneNumber() + '\'' +
                ", dateOfBirth: " + dateOfBirth +
                ", address: " + address +
                "}.";
    }

    public static void main(String[] args) {
        DateOfBirth dateOfBirth = new DateOfBirth(16, 11, 2002);
        Address address = new Address("k94/32", "le huu trac", "an hai dong", "son tra", "da nang");
        Student s1 = new Student("huy", "0905783653", dateOfBirth, address, "ABC12345", 8.5, "huytran@gmail.com");
        System.out.println(s1.toString());

//        Student s2 = new Student();
//        s2.input();
//        System.out.println(s2.toString());
        s1.checkScholarShip();
    }
}

