package com.ravee.springboot.emp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeManagementController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
