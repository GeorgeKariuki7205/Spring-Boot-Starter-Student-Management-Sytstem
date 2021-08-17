package com.example.schoolManagement.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private   final  StudentsRepository studentsRepository;

    @Autowired
    public StudentService(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    public List<StudentEntity> gettingAllStudents(){

        return  studentsRepository.findAll();

    }



}
