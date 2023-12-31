package com.studentapp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studentapp.model.Student;
import com.studentapp.service.StudentServiceIntr;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

	private final StudentServiceIntr stService;

	@PostMapping("/addStudent")
	public ResponseEntity<Student> addStudent(@Valid @RequestBody Student student) {
		return new ResponseEntity<>(stService.addStudent(student), HttpStatus.CREATED);
	}

	@GetMapping("/getStudents")
	public ResponseEntity<List<Student>> getStudents() {

		return new ResponseEntity<>(stService.getStudents(), HttpStatus.OK);
	}

	@GetMapping("/getStudent/{roll}")
	public ResponseEntity<Student> getStudent(@PathVariable Integer roll) {

		return new ResponseEntity<>(stService.getStudent(roll), HttpStatus.OK);
	}

	@DeleteMapping("/deleteStudent/{roll}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer roll) {

		return new ResponseEntity<>(stService.deleteStudent(roll), HttpStatus.OK);
	}

	@PutMapping("/updateStudent/{marks}")
	public ResponseEntity<String> updatedStudent(@RequestParam Integer roll, @PathVariable Integer marks) {
		return new ResponseEntity<>(stService.updateStudent(roll, marks), HttpStatus.OK);
	}

	@GetMapping("/filterStudent/{marks}")
	public ResponseEntity<List<String>> filterStudent(@PathVariable Integer marks) {
		return new ResponseEntity<>(stService.filterStudentbasedOnMarks(marks), HttpStatus.OK);
	}

	@GetMapping("/filterOnParameter")
	public ResponseEntity<List<String>> getMethodName(@RequestParam(required = false) String name,
			@RequestParam(required = false) String standard, @RequestParam(required = false) Integer roll) {
		return new ResponseEntity<>(stService.filterStudentOnVariousPara(name, standard, roll),
				HttpStatus.OK);
	}

}
