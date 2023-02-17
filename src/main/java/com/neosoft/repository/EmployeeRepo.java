package com.neosoft.repository;

import com.neosoft.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,String> {
}
