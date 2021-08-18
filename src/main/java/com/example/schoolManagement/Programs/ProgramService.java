package com.example.schoolManagement.Programs;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ProgramService {

    private final ProgramRepository programRepository;



    public List<ProgramEntity> getAllPrograms(){
        return programRepository.findAll();
    }

    public void addProgram(ProgramEntity programEntity){
        programRepository.save(programEntity);
    }
}
