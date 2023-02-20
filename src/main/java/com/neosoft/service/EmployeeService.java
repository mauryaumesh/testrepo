package com.neosoft.service;


import com.neosoft.model.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployeeById(String employeeId);

    Employee getEmployeeByName(String employeeName);

    List<Employee> getAllEmployeeByName(String employeeName);

    void deleteEmployeeById(String employeeId);
    Employee updateEmployeeByID(Employee employee,String employeeId);

}
