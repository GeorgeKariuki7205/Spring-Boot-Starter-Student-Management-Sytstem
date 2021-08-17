package com.example.schoolManagement.Students;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "students",
        uniqueConstraints = {
                @UniqueConstraint(name = "student_email_unique", columnNames = "email")
        }
)
public class StudentEntity {

    @Id
    @SequenceGenerator(
            name = "z_student_sequence",
            sequenceName = "z_student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "z_student_sequence"
    )
    @Column(
            name = "id"
    )
    private Long studentId;
    @Column(name = "first_name", nullable = false, columnDefinition = "VARCHAR", length = 254)
    private String studentFirstName;
    @Column(name = "last_name", nullable = false, columnDefinition = "VARCHAR", length = 254)
    private String studentLastName;
    @Column(name = "date_of_birth", nullable = false, columnDefinition = "DATE")
    private Date studentDateOfBirth;
    @Column(name = "email", nullable = false, columnDefinition = "VARCHAR", length = 254)
    private String studentEmail;

    public StudentEntity(Long studentId, String studentFirstName, String studentLastName, Date studentDateOfBirth, String studentEmail) {
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentDateOfBirth = studentDateOfBirth;
        this.studentEmail = studentEmail;
    }

    public StudentEntity() {

    }

    public StudentEntity(String studentFirstName, String studentLastName, Date studentDateOfBirth, String studentEmail) {
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentDateOfBirth = studentDateOfBirth;
        this.studentEmail = studentEmail;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public Date getStudentDateOfBirth() {
        return studentDateOfBirth;
    }

    public void setStudentDateOfBirth(Date studentDateOfBirth) {
        this.studentDateOfBirth = studentDateOfBirth;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "studentId=" + studentId +
                ", studentFirstName='" + studentFirstName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", studentDateOfBirth=" + studentDateOfBirth +
                ", studentEmail='" + studentEmail + '\'' +
                '}';
    }

}
