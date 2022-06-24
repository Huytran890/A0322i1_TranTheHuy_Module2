package exercise.manageStudent;

import java.util.Scanner;

public class Person implements IPerson {
    protected String name;
    protected String phoneNumber;
    protected DateOfBirth dateOfBirth;
    protected Address address;

    public Person() {
        this.name = "";
        this.phoneNumber = "";
        this.dateOfBirth = new DateOfBirth();
        this.address = new Address();
    }

    public Person(String name, String phoneNumber, DateOfBirth dateOfBirth, Address address) {
        setName(name);
        setPhoneNumber(phoneNumber);
        setDateOfBirth(dateOfBirth);
        setAddress(address);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name: '" + name + '\'' +
                ", phoneNumber: '" + phoneNumber + '\'' +
                ", dateOfBirth: " + dateOfBirth +
                ", address: " + address +
                "}.";
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        setName(sc.nextLine());
        System.out.println("Enter the phone number: ");
        setPhoneNumber(sc.nextLine());
        System.out.println("Enter the Date of birth for person");
        dateOfBirth.input();
        System.out.println("Enter the Address for person");
        address.input();
    }

    public static void main(String[] args) {
        Person per = new Person();
        per.input();
        System.out.println(per.toString());
    }
}
