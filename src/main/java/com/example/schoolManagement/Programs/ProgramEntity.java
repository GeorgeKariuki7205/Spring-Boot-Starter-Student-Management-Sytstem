package com.example.schoolManagement.Programs;
import lombok.Data;

import javax.persistence.*;
@Data
@Table(name = "programs")
public class ProgramEntity {

    @Id
    @SequenceGenerator(name = "z_sequence_programs", sequenceName = "z_sequence_programs")
    @GeneratedValue(generator = "z_sequence_programs", strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long programId;

    @Column(name = "name", nullable = false)
    private String programName;

    public ProgramEntity(String programName) {
        this.programName = programName;
    }
}
