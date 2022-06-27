package case_study.models;

public class Employee extends Person {
    private String employeeId;
    private final String[] educationLevel = {"Intermediate degree", "Degree Of Associate", "College degree"}; // bằng trung cấp, cao đẳng và đại học.
    private String degree;
    private final String[] positionArray = {"Receptionist", "Waiter", "Security guard", "Marketing", "Manager", "Director"};
    private String position;
    private float salary;

    public Employee() {

    }

    public Employee(String name, boolean gender, String identityCard, String phoneNumber, String email, DateOfBirth dateOfBirth, Address address, String employeeId, String degree, String position, float salary) {
        super(name, gender, identityCard, phoneNumber, email, dateOfBirth, address);
        setEmployeeId(employeeId);
        setDegree(educationLevel[Integer.parseInt(degree)]);
        setPosition(positionArray[Integer.parseInt(position)]);
        setSalary(salary);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String[] getEducationLevel() {
        return educationLevel;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = educationLevel[Integer.parseInt(degree)];
    }

    public String[] getPositionArray() {
        return positionArray;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = positionArray[Integer.parseInt(position)];
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void showInformation() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                "employeeId: '" + employeeId + '\'' +
                ", degree: '" + degree + '\'' +
                ", position: '" + position + '\'' +
                ", salary: " + salary +
                "}.";
    }
}
