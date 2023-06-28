package com.example.studentspring.controller;

import com.example.studentspring.model.EmployeeModel;
import com.example.studentspring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping("/addemployee")
    public EmployeeModel addEmp(@RequestBody EmployeeModel model){
        EmployeeModel employee = service.createEmp(model);
        return employee;

    }

    @GetMapping("/allemployees")
    public List<EmployeeModel> showData(){
       List< EmployeeModel> employees = service.allEmps();
       return employees;
    }


    @GetMapping("/getbyid/{id}")
    public EmployeeModel employeeData(@PathVariable int id){
        EmployeeModel employee = service.getEmployee(id);
        return  employee;
    }



    @DeleteMapping("/deletebyid/{id}")
    public void deleteData(@PathVariable int id){
        String employee = service.deleteEmp(id);
        System.out.println(id+" Employees data is Deleted");
    }

    @PutMapping("/updateemployee/{id}")
    public EmployeeModel updateEmp(@RequestBody EmployeeModel model,@PathVariable int id){
        EmployeeModel employee = service.updateEmployee(model,id);
        return employee;
    }
}
