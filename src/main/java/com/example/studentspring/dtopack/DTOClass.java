package com.example.studentspring.dtopack;

import com.example.studentspring.model.EmployeeModel;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
@Data
@NoArgsConstructor
//clone EmployeeModel class
public class DTOClass extends EmployeeModel{

    private String employeeName;
    private String gender;
    private String email;
    private long phoneNumber;
    private String profilePic;
    private String department;
    private long salary;
    private Date date;


    //Custom Constructor
    public DTOClass(DTOClass model) {

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
