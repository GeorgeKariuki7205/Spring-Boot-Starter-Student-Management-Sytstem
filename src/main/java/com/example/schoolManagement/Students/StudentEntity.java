package com.example.schoolManagement.Students;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.SEQUENCE;
@Data
@Entity
@Table(name = "students",
        uniqueConstraints = {
                @UniqueConstraint(name = "student_email_unique", columnNames = "email")
        }
)
public class StudentEntity {

    @Id
    @SequenceGenerator(name = "z_student_sequence", sequenceName = "z_student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "z_student_sequence")
    @Column(name = "id")
    private Long studentId;

    @Column(name = "first_name", nullable = false)
    private String studentFirstName;

    @Column(name = "last_name", nullable = false)
    private String studentLastName;

    @Column(name = "date_of_birth", nullable = false)
    private Date studentDateOfBirth;

    @Column(name = "email", nullable = false)
    private String studentEmail;

    public StudentEntity(String studentFirstName, String studentLastName, Date studentDateOfBirth, String studentEmail) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentDateOfBirth = studentDateOfBirth;
        this.studentEmail = studentEmail;
    }

}
