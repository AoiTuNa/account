package com.nhnacademy.edu.springboot.student.service;

import com.nhnacademy.edu.springboot.student.domain.Student;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NhnStudentServiceTest {

    @Autowired
    StudentService studentService;

    @Test
    void getStudents() {
        List<Student> actual = studentService.getStudents();
        Assertions.assertThat(actual).hasSize(2);
    }
}