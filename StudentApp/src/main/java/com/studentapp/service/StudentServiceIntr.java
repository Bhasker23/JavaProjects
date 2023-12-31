package com.studentapp.service;


import java.util.List;
import java.util.Optional;

import com.studentapp.model.Student;


public interface StudentServiceIntr {

	Student addStudent(Student st);
	
	List<Student> getStudents();
	
	Student getStudent(Integer roll);
	
	String deleteStudent(Integer roll);
	
	String updateStudent(Integer roll, Integer revisedMarks);
	
	List<String> filterStudentbasedOnMarks(Integer marks);
	
 	List<String> filterStudentOnVariousPara(String name, String standard, Integer roll);
}
