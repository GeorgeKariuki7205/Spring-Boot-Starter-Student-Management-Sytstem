package com.example.schoolManagement.Students;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping(path = "api/students")
public class StudentController {
    private  final StudentService studentService;

    @GetMapping
    public List<StudentEntity> getAllStudents(){

        return  studentService.gettingAllStudents();

    }

}
