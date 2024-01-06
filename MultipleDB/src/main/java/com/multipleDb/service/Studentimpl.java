package com.multipleDb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multipleDb.db1entity.Student;
import com.multipleDb.db1repo.StudentRepo;


@Service
public class Studentimpl implements StudentIntr {

	
	@Autowired
	private StudentRepo studentRepo;
	@Override
	public Student addStudent(Student student) {
		
		Student st = new Student();
		
		st.setName(student.getName());
		
		return studentRepo.save(st);
	}

}
