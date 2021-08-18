package com.example.schoolManagement.Departments;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping(path = "api/departments")
public class DepartmentController {

    private  final  DepartmentService departmentService;

    @GetMapping
    public List<DepartmentEntity> gettingAllDepartments(){
        return departmentService.gettingAllDepartments();
    }

    @PostMapping
    public void addDepartment(@RequestBody DepartmentEntity departmentEntity){
        departmentService.addDepartment(departmentEntity);
    }
}
