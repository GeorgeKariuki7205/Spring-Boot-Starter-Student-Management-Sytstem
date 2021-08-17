package com.example.schoolManagement.Schools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    private  final  SchoolRepository schoolRepository;

    @Autowired
    public SchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public List<SchoolEntity> getAllSchools(){
        return  schoolRepository.findAll();
    }

    public void addSchool(SchoolEntity schoolEntity){

        schoolRepository.save(schoolEntity);

    }
}
