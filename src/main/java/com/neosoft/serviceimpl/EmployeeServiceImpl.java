package com.neosoft.serviceimpl;

import com.neosoft.model.entity.Employee;
import com.neosoft.repository.EmployeeRepo;
import com.neosoft.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(String employeeId) {
        return employeeRepo.findByEmployeeId(employeeId);
    }

    @Override
    public Employee getEmployeeByName(String employeeName) {
        return employeeRepo.findByEmployeeName(employeeName);
    }

    @Override
    public List<Employee> getAllEmployeeByName(String employeeName) {
        return employeeRepo.findAllByEmployeeName(employeeName);
    }

    @Override
    public void deleteEmployeeById(String employeeId) {
        employeeRepo.deleteByEmployeeId(employeeId);
    }

    @Override
    public Employee updateEmployeeByID(Employee employee,String employeeId) {

       Employee emp = employeeRepo.findByEmployeeId(employeeId);
        employee.setEmployeeId(emp.getEmployeeId());
        return employeeRepo.save(employee);
    }
}
