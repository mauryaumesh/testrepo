package com.neosoft.controller;

import com.neosoft.model.entity.Employee;
import com.neosoft.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;


    @PostMapping("/add")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
       Employee save = this.employeeRepo.save(employee);
       return ResponseEntity.ok(save);
    }

    @GetMapping("/get")
    public ResponseEntity<?> getEmployee(){
        return ResponseEntity.ok(this.employeeRepo.findAll());
    }

}
