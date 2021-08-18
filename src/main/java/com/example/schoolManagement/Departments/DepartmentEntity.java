package com.example.schoolManagement.Departments;

import com.example.schoolManagement.Schools.SchoolEntity;
import lombok.Data;

import javax.persistence.*;
import javax.persistence.Id;
@Data
@Entity
@Table(name = "departments")
public class DepartmentEntity {

    @Id
    @SequenceGenerator(name = "z_department_sequence", sequenceName = "z_department_sequence", allocationSize = 1)
    @GeneratedValue(generator = "z_department_sequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long departmentId;

    @Column(name = "name", nullable = false)
    private String departmentName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "school_id", referencedColumnName = "id",
                foreignKey = @ForeignKey(
                        name = "department_school_id_fk"
                )
    )
    private SchoolEntity schoolEntity;

    public DepartmentEntity(String departmentName, SchoolEntity schoolEntity) {
        this.departmentName = departmentName;
        this.schoolEntity = schoolEntity;
    }

}
