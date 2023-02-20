package com.neosoft.repository;

import com.neosoft.model.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee,String> {

    Employee findByEmployeeId(String employeeId);

    Employee findByEmployeeName(String employeeName);

    List<Employee> findAllByEmployeeName(String employeeName);

    void deleteByEmployeeId(String employeeId);
}
