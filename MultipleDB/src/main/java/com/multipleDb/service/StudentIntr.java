package com.multipleDb.service;

import org.springframework.stereotype.Service;

import com.multipleDb.db1entity.Student;

@Service
public interface StudentIntr {

	Student addStudent(Student student);
}
