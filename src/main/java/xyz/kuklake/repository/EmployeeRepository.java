package xyz.kuklake.repository;

import xyz.kuklake.employee.Employee;

public class EmployeeRepository {

    public Employee find(long id) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setFirstName("Kuklake" + id);
        employee.setLast_name("Bulake" + id);

        return employee;
    }
}
