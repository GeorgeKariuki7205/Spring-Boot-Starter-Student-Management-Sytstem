package com.example.schoolManagement.Schools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(path = "api/school")
public class SchoolController {

    private final SchoolService schoolService;

    @Autowired
    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping
    public List<SchoolEntity> gettingAllSchools(){
        return schoolService.getAllSchools();
    }

    @PostMapping
    public void addSchool(@RequestBody SchoolEntity schoolEntity){
        schoolService.addSchool(schoolEntity);
    }
}
