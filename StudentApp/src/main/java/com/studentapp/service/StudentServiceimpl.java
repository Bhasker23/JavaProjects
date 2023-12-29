package com.studentapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.exceptionhandler.StudentException;
import com.studentapp.model.Student;
import com.studentapp.repo.StudentRepo;

@Service
public class StudentServiceimpl implements StudentServiceIntr {

	@Autowired
	private StudentRepo stRepo;

	@Override
	public Student addStudent(Student st) {
		return stRepo.save(st);
	}

	@Override
	public List<Student> getStudents() {

		if (stRepo.findAll().isEmpty()) {
			throw new StudentException("Oops! Student list is empty..");
		}
		List<Student> st = stRepo.findAll();
		return st;
	}

	@Override
	public String deleteStudent(Integer roll) {
		if (!stRepo.findById(roll).isPresent()) {
			throw new StudentException("Student is not present with given roll no. " + roll);
		}
		stRepo.deleteById(roll);
		return "Student delted with given id " + roll;
	}

	@Override
	public Student updateStudent(Integer roll, Integer marks) {

		if (!stRepo.findById(roll).isPresent()) {
			throw new StudentException("Student is not present with given roll no. " + roll);
		}
		Student st = stRepo.findById(roll).get();
		st.setMarks(marks + st.getMarks());
		stRepo.save(st);
		return st;
	}

	@Override
	public Student getStudent(Integer roll) {
		if (!stRepo.findById(roll).isPresent()) {
			throw new StudentException("Student is not present with given roll no. " + roll);
		}
		return stRepo.findById(roll).get();

	}

	@Override
	public List<String> filterStudentbasedOnMarks(Integer marks) {

		List<Student> listSt = stRepo.findAll();
		List<String> stNames = new ArrayList<String>();

		for (Student student : listSt) {
			if (student.getMarks() >= marks) {
				stNames.add(student.getName());
			}
		}
		return stNames;
	}

	@Override
	public List<String> filterStudentOnVariousPara(String name, String standard, Integer roll) {

		List<Student> student = stRepo.findStudent(name, standard, roll);
		List<String> res = new ArrayList<String>();
		for (Student each : student) {
			res.add(each.getName());
		}
		if (res.isEmpty()) {
			throw new StudentException("No Data Available for given request");
		}
		return res;
	}

}
