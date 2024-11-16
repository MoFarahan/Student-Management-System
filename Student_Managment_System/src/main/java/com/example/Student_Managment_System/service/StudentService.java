package com.example.Student_Managment_System.service;

import java.util.List;

import com.example.Student_Managment_System.entity.Student;
import com.example.Student_Managment_System.repository.StudentRepository;

public interface StudentService {
 
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}
