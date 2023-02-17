package com.neosoft.serviceimpl;

import com.neosoft.model.entity.Employee;
import com.neosoft.repository.EmployeeRepo;
import com.neosoft.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<Employee> getEmployeeById(String employeeId) {
        return employeeRepo.findById(employeeId);
    }

    @Override
    public void deleteEmployee(String employeeId) {
        employeeRepo.deleteById(employeeId);
    }

    @Override
    public Employee updateEmployeeByID(Employee employee,String employeeId) {

       Optional<Employee> emp = employeeRepo.findById(employeeId);
        employee.setEmployeeId(emp.get().getEmployeeId());
        return employeeRepo.save(employee);
    }
}
