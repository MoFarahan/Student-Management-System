package com.example.Student_Managment_System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Student_Managment_System.entity.Student;
import com.example.Student_Managment_System.repository.StudentRepository;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		
//		Student student1 = new Student("Farhan","Momin","farahan@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Ram","Sharma","ram@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("manav","verma","manav@gmail.com");
//		studentRepository.save(student3);
//		
	}

}
