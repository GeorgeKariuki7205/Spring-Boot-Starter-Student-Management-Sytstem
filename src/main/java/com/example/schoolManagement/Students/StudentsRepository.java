package com.example.schoolManagement.Students;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository  extends JpaRepository<StudentEntity,Long> {
}
