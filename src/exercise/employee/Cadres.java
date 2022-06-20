package exercise.employee;

import java.util.Scanner;

public class Cadres {
    protected String name;
    protected boolean sex;
    protected String phoneNumber;
    protected DateOfBirth dateOfBirth;
    protected Address address;

    public Cadres() {
        this.name = "";
        this.sex = true;
        this.phoneNumber = "";
        this.dateOfBirth = new DateOfBirth();
        this.address = new Address();
    }

    public Cadres(String name, boolean sex, String phoneNumber, DateOfBirth dateOfBirth, Address address) {
        setName(name);
        setSex(sex);
        setPhoneNumber(phoneNumber);
        setDateOfBirth(dateOfBirth);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

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
        String stringGender;
        if (this.sex)
            stringGender = "Male";
        else
            stringGender = "Female";
        return "Cadres {" +
                "name: " + name +
                ", sex: " + stringGender +
                ", phone number: " + getPhoneNumber() +
                ", date of birth: " + dateOfBirth.toString() +
                ", address: " + address.toString() + "}.";
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name's cadres: ");
        setName(sc.nextLine());
        System.out.println("Enter gender's cadres: ");
        setSex(sc.nextBoolean());
        sc.nextLine();
        System.out.println("Enter Phone number: ");
        setPhoneNumber(sc.nextLine());
        System.out.println("Enter date of birth for cadres ");
        dateOfBirth.input();
        System.out.println("Enter address's cadres ");
        address.input();
    }

    public static void main(String[] args) {
//        Cadres per1 = new Cadres();
//        per1.input();
//        System.out.println(per1.toString());

        Address address = new Address("k94/32", "Le huu trac", "An hai dong", "son tra", "da nang");
        DateOfBirth dateOfBirth = new DateOfBirth(16, 11, 2002);
        Cadres per2 = new Cadres("Tran The Huy", true, "0905783653", dateOfBirth, address);
        System.out.println(per2.toString());

    }
}
