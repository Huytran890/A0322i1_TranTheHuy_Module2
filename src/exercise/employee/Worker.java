package exercise.employee;

import java.util.Scanner;

public class Worker extends Cadres {
    private int level;

    public Worker() {
    }

    public Worker(String name, boolean sex, String phoneNumber, DateOfBirth dateOfBirth, Address address, int level) {
        super(name, sex, phoneNumber, dateOfBirth, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level <= 0)
            this.level = 1;
        else
            this.level = level;
    }

    @Override
    public String toString() {
        String stringGender;
        if (this.sex)
            stringGender = "Male";
        else
            stringGender = "Female";
        return "Worker {" +
                "level: " + level +
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
        level = sc.nextInt();
        setLevel(level);
    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.input();
        System.out.println(worker.toString());
    }
}
