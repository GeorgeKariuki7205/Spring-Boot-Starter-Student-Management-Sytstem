package com.example.schoolManagement.Schools;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping(path = "api/school")
public class SchoolController {

    private final SchoolService schoolService;

    @GetMapping
    public List<SchoolEntity> gettingAllSchools(){
        return schoolService.getAllSchools();
    }

    @PostMapping
    public void addSchool(@RequestBody SchoolEntity schoolEntity){
        schoolService.addSchool(schoolEntity);
    }
}
