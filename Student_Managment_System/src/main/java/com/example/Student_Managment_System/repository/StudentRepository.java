package com.example.Student_Managment_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student_Managment_System.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
