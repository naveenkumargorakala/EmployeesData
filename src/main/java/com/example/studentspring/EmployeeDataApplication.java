package com.example.studentspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
@Component
@SpringBootApplication
public class EmployeeDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeDataApplication.class, args);
        System.out.println("Naveen");
    }

}
