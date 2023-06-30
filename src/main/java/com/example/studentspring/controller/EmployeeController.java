package com.example.studentspring.controller;

import com.example.studentspring.dtopack.DTOClass;
import com.example.studentspring.model.EmployeeModel;
import com.example.studentspring.service.EmployeeInterface;
import com.example.studentspring.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Slf4j
@RestController
public class EmployeeController {

    //loose coupling..
    @Autowired
    private EmployeeInterface service;

    //post the data into DB
    @PostMapping("/addemployee")
    public EmployeeModel addEmp(@RequestBody DTOClass model){
        EmployeeModel employee = service.createEmp(model);
        return employee;
    }

    //get the all data from DB
    @GetMapping("/allemployees")
    public List<EmployeeModel> showData(){
       List< EmployeeModel> employees = service.allEmps();
       return employees;
    }

   //get the data from Db Only one Employee
    @GetMapping("/getbyid/{id}")
    public EmployeeModel employeeData(@PathVariable int id){
        EmployeeModel employee = service.getEmployee(id);
        return  employee;
    }

    //Delete Data By using id from DB
    @DeleteMapping("/deletebyid/{id}")
    public void deleteData(@PathVariable int id){
        String employee = service.deleteEmp(id);
        System.out.println(id+" Employees data is Deleted");
    }

    //update the data in Db by using Employee id
    @PutMapping("/updateemployee/{id}")
    public EmployeeModel updateEmp(@RequestBody DTOClass model,@PathVariable int id){
        EmployeeModel employee = service.updateEmployee(model,id);
        return employee;
    }
}
