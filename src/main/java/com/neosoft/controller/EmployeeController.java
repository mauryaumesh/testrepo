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

    @GetMapping("/get/{employeeId}")
    public ResponseEntity<?> getEmployeeById(@PathVariable String employeeId){
        return ResponseEntity.ok(this.employeeService.getEmployeeById(employeeId));
    }

    @GetMapping("/getByName/{employeeName}")
    public ResponseEntity<?> getEmployeeByName(@PathVariable String employeeName){
        return ResponseEntity.ok(this.employeeService.getEmployeeByName(employeeName));
    }

    @GetMapping("/getAllByName/{employeeName}")
    public ResponseEntity<?> getAllEmployeeByName(@PathVariable String employeeName){
        return ResponseEntity.ok(this.employeeService.getAllEmployeeByName(employeeName));
    }

    @PutMapping("/update/{employeeId}")
    public ResponseEntity<?> updateEmployee(@PathVariable String employeeId,@RequestBody Employee employee){
        return  ResponseEntity.ok(this.employeeService.updateEmployeeByID(employee,employeeId));
    }
}
