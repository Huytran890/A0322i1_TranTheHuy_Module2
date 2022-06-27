package case_study.models;

public abstract class Person {
    private String name;
    private boolean gender;
    private String identityCard;
    private String phoneNumber;
    private String email;
    private DateOfBirth dateOfBirth;
    private Address address;

    public Person() {
        this.name = "";
        this.gender = true;
        this.identityCard = "";
        this.phoneNumber = "";
        this.email = "";
        this.dateOfBirth = new DateOfBirth();
        this.address = new Address();
    }

    public Person(String name, boolean gender, String identityCard, String phoneNumber, String email, DateOfBirth dateOfBirth, Address address) {
        setName(name);
        setGender(gender);
        setIdentityCard(identityCard);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setDateOfBirth(dateOfBirth);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public abstract void showInformation();

    @Override
    public String toString() {
        String stringGender;
        if (this.gender)
            stringGender = "Male";
        else
            stringGender = "Female";
        return "The personal information: {" +
                "name: '" + name + '\'' +
                ", gender: " + stringGender +
                ", identityCard: '" + identityCard + '\'' +
                ", phoneNumber: '" + phoneNumber + '\'' +
                ", email: '" + email + '\'' +
                ", dateOfBirth: " + dateOfBirth +
                ", address: " + address +
                ", ";
    }
}
