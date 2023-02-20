package com.neosoft.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "employees")
public class Employee {

    private String id;

    private String employeeId;

    private String employeeName;

    private String phoneNo;


    private Integer age;
    private boolean active;




}
