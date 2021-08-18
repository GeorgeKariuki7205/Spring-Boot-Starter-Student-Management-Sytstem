package com.example.schoolManagement.Students;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class StudentService {
    private   final  StudentsRepository studentsRepository;

    public List<StudentEntity> gettingAllStudents(){

        return  studentsRepository.findAll();

    }



}
