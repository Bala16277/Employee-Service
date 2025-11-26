package com.bala.emp.services;

import com.bala.emp.entities.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Integer id);
    Employee saveEmployee(Employee employee);
    void deleteEmployee(Integer id);
    List<Employee> getEmployeesByDepartment(String department);
}
