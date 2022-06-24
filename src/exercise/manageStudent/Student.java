package exercise.manageStudent;

import java.util.Scanner;

public class Student extends Person {
    private double mark;
    private String email;

    public Student() {
    }


    public Student(String name, String phoneNumber, DateOfBirth dateOfBirth, Address address, double mark, String email) {
        super(name, phoneNumber, dateOfBirth, address);
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
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email != null && email.contains("@") && !email.contains(" ")) {
            this.email = email;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.print("Enter mark: ");
            mark = sc.nextDouble();
            if (setMark(mark) == false)
                System.err.println("Wrong value, enter mark again!!!");
            else
                check = false;
        } while (check);
        sc.nextLine();
        do {
            System.out.print("Enter email: ");
            email = sc.nextLine();
            if (setEmail(email) == false)
                System.err.println("Wrong value, enter email again!!!");
            else
                check = false;
        } while (check);
    }

    public void checkScholarShip() {
        if (mark >= 8)
            System.out.println("You got a scholarship for next term. Congratulation.");
        else
            System.out.println("You didn't get a scholarship for next term! \n" + "GOOD LUCK NEXT TERM.");
    }

    @Override
    public String toString() {
        return "Student {" +
                "mark: " + getMark() +
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
        Student s1 = new Student("huy", "0905783653", dateOfBirth, address,8.5,"huytran@gmail.com");
        System.out.println(s1.toString());

//        Student s2 = new Student();
//        s2.input();
//        System.out.println(s2.toString());
        s1.checkScholarShip();
    }
}

