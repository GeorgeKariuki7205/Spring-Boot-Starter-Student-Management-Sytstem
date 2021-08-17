package com.example.schoolManagement.Departments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private  final  DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<DepartmentEntity> gettingAllDepartments(){
        return  departmentRepository.findAll();
    }

    public void addDepartment(DepartmentEntity departmentEntity){
        departmentRepository.save(departmentEntity);
    }
}
