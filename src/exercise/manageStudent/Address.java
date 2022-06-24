package exercise.manageStudent;

import java.util.Scanner;

public class Address {
    private String number, street, district, ward, city;

    public Address() {
        number = "";
        street = "";
        district = "";
        ward = "";
        city = "";
    }

    public Address(String number, String street, String district, String ward, String city) {
        setNumber(number);
        setStreet(street);
        setDistrict(district);
        setWard(ward);
        setCity(city);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter house's number: ");
        setNumber(sc.nextLine());
        System.out.println("Enter street: ");
        setStreet(sc.nextLine());
        System.out.println("Enter district: ");
        setDistrict(sc.nextLine());
        System.out.println("Enter ward: ");
        setWard(sc.nextLine());
        System.out.println("Enter city: ");
        setCity(sc.nextLine());
    }

    public String toString() {
        return (getNumber() + "," + getStreet() + "," + getDistrict() + "," + getWard() + "," + getCity() + "\n");
    }

    public static void main(String[] args) {
        exercise.employee.Address address1 = new exercise.employee.Address();
        address1.input();
        System.out.println(address1.toString());

        exercise.employee.Address address2 = new exercise.employee.Address();
        address2.input();
        System.out.println(address2.toString());
    }
}
