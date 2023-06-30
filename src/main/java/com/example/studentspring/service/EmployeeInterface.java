package com.example.studentspring.service;

import com.example.studentspring.dtopack.DTOClass;
import com.example.studentspring.model.EmployeeModel;

import java.util.List;

public interface EmployeeInterface {

   //Abstract Methods
   EmployeeModel createEmp(DTOClass model);

    List<EmployeeModel> allEmps();

    EmployeeModel getEmployee(int id);

    String deleteEmp(int id);

    EmployeeModel updateEmployee(DTOClass model, int id);
}
