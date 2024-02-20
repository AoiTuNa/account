package com.nhnacademy.edu.springboot.student.Controller;

import com.nhnacademy.edu.springboot.student.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@Controller
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome(Map model) {
        model.put("message", "Welcome to the world!");
        return "welcome";
    }
}
