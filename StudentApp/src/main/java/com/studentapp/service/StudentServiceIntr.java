package com.studentapp.service;


import java.util.List;
import java.util.Optional;

import com.studentapp.model.Student;


public interface StudentServiceIntr {

	Student addStudent(Student st);
	
	List<Student> getStudents();
	
	Student getStudent(Integer roll);
	
	String deleteStudent(Integer roll);
	
	Student updateStudent(Integer roll, Integer revisedMarks);
}
