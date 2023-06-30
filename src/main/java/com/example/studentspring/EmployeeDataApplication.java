package com.example.studentspring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class EmployeeDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeDataApplication.class, args);
        System.out.println("Naveen");
        //logger
        log.error("Springboot Not working...");
        log.debug("debug your Application...");
    }

}
