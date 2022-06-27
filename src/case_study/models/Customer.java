package case_study.models;

public class Customer extends Person {
    private String customerId;
    private final String[] customerTypeArray = {"Diamond", "Platinium", "Gold", "Silver", "Member"};
    private String customerType;
    private Facility facility;

    public Customer() {

    }

    public Customer(String name, boolean gender, String identityCard, String phoneNumber, String email, DateOfBirth dateOfBirth, Address address, String customerId, String customerType, Facility facility) {
        super(name, gender, identityCard, phoneNumber, email, dateOfBirth, address);
        setCustomerId(customerId);
        setCustomerType(customerTypeArray[Integer.parseInt(customerType)]);
        setFacility(facility);
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String[] getCustomerTypeArray() {
        return customerTypeArray;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerTypeArray[Integer.parseInt(customerType)];
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public void showInformation() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                "customerId: '" + customerId + '\'' +
                ", customerType: '" + customerType + '\'' +
                ", facility: " + facility.toString() +
                "}.";
    }
}
