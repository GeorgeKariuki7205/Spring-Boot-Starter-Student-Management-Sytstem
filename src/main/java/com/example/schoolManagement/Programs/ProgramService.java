package com.example.schoolManagement.Programs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramService {

    private final ProgramRepository programRepository;

    @Autowired
    public ProgramService(ProgramRepository programRepository) {
        this.programRepository = programRepository;
    }

    public List<ProgramEntity> getAllPrograms(){
        return programRepository.findAll();
    }

    public void addProgram(ProgramEntity programEntity){
        programRepository.save(programEntity);
    }
}
