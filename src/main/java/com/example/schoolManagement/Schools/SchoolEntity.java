package com.example.schoolManagement.Schools;

import javax.persistence.*;

@Entity
@Table(name = "schools")
public class SchoolEntity {

    @Id
    @SequenceGenerator(
            sequenceName = "z_school_sequence",
            name = "z_school_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "z_school_sequence",
            strategy = GenerationType.SEQUENCE
    )
    @Column(
            name = "id", nullable = false
    )
    private Long schoolId;

    @Column(
            name = "name",
            nullable = false
    )
    private String schoolName;

    @Column(
            name = "location",
            nullable = false
    )
    private String schoolLocation;

    public SchoolEntity(String schoolName, String schoolLocation) {
        this.schoolName = schoolName;
        this.schoolLocation = schoolLocation;
    }

    public SchoolEntity(Long schoolId, String schoolName, String schoolLocation) {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
        this.schoolLocation = schoolLocation;
    }

    public SchoolEntity() {

    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolLocation() {
        return schoolLocation;
    }

    public void setSchoolLocation(String schoolLocation) {
        this.schoolLocation = schoolLocation;
    }

    @Override
    public String toString() {
        return "SchoolEntity{" +
                "schoolId=" + schoolId +
                ", schoolName='" + schoolName + '\'' +
                ", schoolLocation='" + schoolLocation + '\'' +
                '}';
    }
}
