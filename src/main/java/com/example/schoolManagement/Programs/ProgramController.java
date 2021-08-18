package com.example.schoolManagement.Programs;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping(path = "api/program")
public class ProgramController {

    private  final  ProgramService programService;



    public List<ProgramEntity> getAllPrograms(){
        return programService.getAllPrograms();
    }

    @PostMapping
    public  void addProgram(@RequestBody ProgramEntity programEntity){

        programService.addProgram(programEntity);

    }
}
