package com.example.schoolManagement.Schools;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SchoolService {
    private  final  SchoolRepository schoolRepository;

    public List<SchoolEntity> getAllSchools(){
        return  schoolRepository.findAll();
    }

    public void addSchool(SchoolEntity schoolEntity){

        schoolRepository.save(schoolEntity);

    }
}
