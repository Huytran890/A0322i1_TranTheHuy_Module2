package exercise.employee;

import java.util.Scanner;

public class Engineer extends Cadres {
    private String specialize;

    public Engineer() {

    }

    public Engineer(String name, boolean sex, String phoneNumber, DateOfBirth dateOfBirth, Address address, String specialize) {
        super(name, sex, phoneNumber, dateOfBirth, address);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        String stringGender;
        if (this.sex)
            stringGender = "Male";
        else
            stringGender = "Female";
        return "Engineer {" +
                "specialize: '" + specialize + '\'' +
                ", name: '" + name + '\'' +
                ", sex: " + stringGender +
                ", phoneNumber: '" + phoneNumber + '\'' +
                ", dateOfBirth: " + dateOfBirth +
                ", address: " + address +
                "}.";
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Please enter the specialize of engineer: ");
        specialize = sc.nextLine();
    }

    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        engineer.input();
        System.out.println(engineer.toString());
    }
}
