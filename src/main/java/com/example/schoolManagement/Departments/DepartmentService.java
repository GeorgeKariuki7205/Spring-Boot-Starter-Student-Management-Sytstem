package com.example.schoolManagement.Departments;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class DepartmentService {

    private  final  DepartmentRepository departmentRepository;

    public List<DepartmentEntity> gettingAllDepartments(){
        return  departmentRepository.findAll();
    }

    public void addDepartment(DepartmentEntity departmentEntity){
        departmentRepository.save(departmentEntity);
    }
}
