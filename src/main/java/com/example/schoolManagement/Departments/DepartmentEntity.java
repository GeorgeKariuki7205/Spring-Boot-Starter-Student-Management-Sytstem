package com.example.schoolManagement.Departments;

import javax.persistence.*;

@Entity
@Table(name = "departments")
public class DepartmentEntity {

    @Id
    @SequenceGenerator(
            name = "z_department_sequence",
            sequenceName = "z_department_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "z_department_sequence",
            strategy = GenerationType.SEQUENCE

    )
    @Column(
            name = "id"
    )
    private Long departmentId;
    @Column(
            name = "name",
            nullable = false
    )
    private String departmentName;

    public DepartmentEntity(Long departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public DepartmentEntity(String departmentName) {
        this.departmentName = departmentName;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "DepartmentEntity{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
