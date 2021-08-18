package com.example.schoolManagement.Schools;

import com.example.schoolManagement.Departments.DepartmentEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "schools")
public class SchoolEntity {

    @Id
    @SequenceGenerator(sequenceName = "z_school_sequence", name = "z_school_sequence", allocationSize = 1)
    @GeneratedValue(generator = "z_school_sequence", strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long schoolId;

    @Column(name = "name", nullable = false)
    private String schoolName;

    @Column(name = "location", nullable = false)
    private String schoolLocation;


    @OneToMany(
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            mappedBy = "schoolEntity",
            fetch = FetchType.EAGER
    )
    private List<DepartmentEntity> departmentEntityList = new ArrayList<>();

    public SchoolEntity(String schoolName, String schoolLocation) {
        this.schoolName = schoolName;
        this.schoolLocation = schoolLocation;
    }
}
