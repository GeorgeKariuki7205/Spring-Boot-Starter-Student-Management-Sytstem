package com.example.schoolManagement.Programs;

import javax.persistence.*;

@Entity
@Table(name = "programs")
public class ProgramEntity {

    @Id
    @SequenceGenerator(
            name = "z_sequence_programs",
            sequenceName = "z_sequence_programs"
    )

    @GeneratedValue(
            generator = "z_sequence_programs",
            strategy = GenerationType.SEQUENCE
    )
    @Column(
            name = "id",
            nullable = false
    )
    private Long programId;
    @Column(
            name = "name",
            nullable = false
    )
    private String programName;

    public ProgramEntity(Long programId, String programName) {
        this.programId = programId;
        this.programName = programName;
    }

    public ProgramEntity() {
    }

    public ProgramEntity(String programName) {
        this.programName = programName;
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
        return "ProgramEntity{" +
                "programId=" + programId +
                ", programName='" + programName + '\'' +
                '}';
    }
}
