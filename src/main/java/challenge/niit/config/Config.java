package challenge.niit.config;

import challenge.niit.domin.Department;
import challenge.niit.domin.Employee;
import org.springframework.context.annotation.Bean;

public class Config {

    @Bean("employee")
    public Employee getEmployee(){
        Employee employee = new Employee(getDepartment());
        employee.setEmployeeId(12);
        employee.setEmployeeName("Ram");
        return employee;
    }

    @Bean
    public Department getDepartment(){
        return new Department(12,"Admin");
    }
}
