package com.example.schoolManagement.Departments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/departments")
public class DepartmentController {

    private  final  DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<DepartmentEntity> gettingAllDepartments(){
        return departmentService.gettingAllDepartments();
    }

    @PostMapping
    public void addDepartment(@RequestBody DepartmentEntity departmentEntity){
        departmentService.addDepartment(departmentEntity);
    }
}
