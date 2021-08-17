package com.example.schoolManagement.Courses;

import javax.persistence.*;

@Entity
@Table(name = "courses")
public class CourseEntity {

    @Id
    @SequenceGenerator(
            name = "z_course_sequence",
            sequenceName = "z_course_sequence"
    )
    @GeneratedValue(
            generator = "z_course_sequence",
            strategy = GenerationType.SEQUENCE
    )
    @Column(
            name = "id",
            nullable = false
    )
    private Long programId;

    @Column(name = "name", nullable = false, columnDefinition = "TEXT")
    private String programName;

    public CourseEntity(Long programId, String programName) {
        this.programId = programId;
        this.programName = programName;
    }

    public CourseEntity(String programName) {
        this.programName = programName;
    }

    public CourseEntity() {
    }

    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    @Override
    public String toString() {
        return "CourseEntity{" +
                "programId=" + programId +
                ", programName='" + programName + '\'' +
                '}';
    }
}
