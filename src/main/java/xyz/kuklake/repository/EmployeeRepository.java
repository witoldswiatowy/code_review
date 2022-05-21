package xyz.kuklake.repository;

import xyz.kuklake.employee.Employee;

import java.util.HashMap;
import java.util.Map;

//save, update, find, delete
public class EmployeeRepository {

    private static Map <Long, Employee> employeeMap = new HashMap<>();

    public Employee find(long id) {
        Employee employee = employeeMap.get(id);
        return employee;
    }

    public void save(Employee employee){
        employeeMap.put(employee.getId(), employee);
    }
}
