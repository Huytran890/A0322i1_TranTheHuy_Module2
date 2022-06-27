package case_study.services;

import case_study.models.Employee;

public interface EmployeeServices {
    void addNewEmployee();

    void displayListEmployee();

    void editEmployee();

    void removeEmployee();

    Employee isEmployee(String employeeId);
}
