package exercise.employee;

import java.util.Scanner;

public class Staff extends Cadres {
    private String mission;

    public Staff() {

    }

    public Staff(String name, boolean sex, String phoneNumber, DateOfBirth dateOfBirth, Address address, String mission) {
        super(name, sex, phoneNumber, dateOfBirth, address);
        this.mission = mission;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    @Override
    public String toString() {
        String stringGender;
        if (this.sex)
            stringGender = "Male";
        else
            stringGender = "Female";
        return "Staff {" +
                "mission: '" + mission + '\'' +
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
        System.out.println("Please enter the level of worker: ");
        mission = sc.nextLine();
    }
}
