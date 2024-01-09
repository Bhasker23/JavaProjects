package com.studentapp.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.studentapp.exceptionhandler.StudentException;
import com.studentapp.model.Student;
import com.studentapp.repo.StudentRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceimpl implements StudentServiceIntr {

	private final StudentRepo stRepo;

	private static final String MESSAGE = "Student is not present with given roll no. : ";

	@Override
	public Student addStudent(Student st) {
		return stRepo.save(st);
	}

	@Override
	public List<Student> getStudents() {
		return Optional.of(stRepo.findAll()).orElseThrow(() -> new StudentException("Oops! Student list is empty.."));

	}

	@Override
	public String deleteStudent(Integer roll) {

		stRepo.findById(roll).ifPresentOrElse(student -> stRepo.deleteById(roll),
				() -> new StudentException(MESSAGE + roll));

		return "Student delted with given id " + roll;

	}

	@Override
	public String updateStudent(Integer roll, Integer marks) {

		stRepo.findById(roll).ifPresentOrElse(student -> {
			student.setMarks(marks + student.getMarks());
			stRepo.save(student);
		}, () -> new StudentException(MESSAGE + roll));

		return "Student marks updated sucessfully";
	}

	@Override
	public Student getStudent(Integer roll) {

		return stRepo.findById(roll).orElseThrow(() -> new StudentException(MESSAGE + roll));
	}

	@Override
	public List<String> filterStudentbasedOnMarks(Integer marks) {
		return Optional.of(stRepo.findAll()).orElseThrow(() -> new StudentException("Oops! Student list is empty.."))
				.stream().filter(student -> student.getMarks() >= marks).map(Student::getName)
				.collect(Collectors.toList());
	}

	@Override
	public List<String> filterStudentOnVariousPara(String name, String standard, Integer roll) {

	return	Optional.of(stRepo.findStudent(name, standard, roll))
				.orElseThrow(() -> new StudentException("No Data Available for given request")).stream()
				.map(Student::getName).collect(Collectors.toList());

	}

}
