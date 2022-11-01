package challenge.niit.domin;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    private int employeeId;
    private String employeeName;

    private Department department;


    public Employee(int employeeId, String employeeName,Department department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }
    @Autowired
    public Employee(Department department) {

        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", department=" + department +
                '}';
    }
}

