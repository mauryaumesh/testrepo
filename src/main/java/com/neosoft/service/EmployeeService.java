package com.neosoft.service;


import com.neosoft.model.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Optional<Employee> getEmployeeById(String employeeId);
    void deleteEmployee(String employeeId);
    Employee updateEmployeeByID(Employee employee,String employeeId);

}
