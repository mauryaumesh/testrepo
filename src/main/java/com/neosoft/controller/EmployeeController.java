package com.neosoft.controller;

import com.neosoft.model.entity.Employee;
import com.neosoft.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/add")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
       Employee save = this.employeeService.saveEmployee(employee);
       return ResponseEntity.ok(save);
    }

    @GetMapping("/get")
    public ResponseEntity<?> getEmployee(){
        return ResponseEntity.ok(this.employeeService.getAllEmployee());
    }

}
