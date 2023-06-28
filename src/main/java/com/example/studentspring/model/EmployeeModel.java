package com.example.studentspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class EmployeeModel {

    @Id
    @GeneratedValue
    private int employeeID;
    private String employeeName;
    private String gender;
    private String email;
    private long phoneNumber;
    private String profilePic;
    private String department;
    private long salary;
    private Date date;


    //Custom Constructor
    public EmployeeModel(EmployeeModel model) {
        this.employeeName = model.getEmployeeName();
        this.gender = model.getGender();
        this.email = model.getEmail();
        this.phoneNumber = model.getPhoneNumber();
        this.profilePic = model.getProfilePic();
        this.department = model.getDepartment();
        this.salary = model.getSalary();
        this.date = model.getDate();
    }


}
