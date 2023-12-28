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

@RestController
@RequestMapping("/student")
public class StudentController {
	
	
	private  StudentServiceIntr stService;
	public StudentController(StudentServiceIntr strService) {
		this.stService = strService;
	}
	
	@PostMapping("/addStudent")
	public ResponseEntity<Student>  addStudent(@RequestBody Student student) {
		
		
		return new ResponseEntity<Student>(stService.addStudent(student), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getStudents")
	public ResponseEntity<List<Student>> getStudents() {
		
		return new ResponseEntity<List<Student>> (stService.getStudents(), HttpStatus.OK);
	}
	
	@GetMapping("/getStudent/{roll}")
	public ResponseEntity<Student> getStudent(@PathVariable Integer roll) {
		
		return new ResponseEntity<Student> (stService.getStudent(roll), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteStudent/{roll}")
	public ResponseEntity<String> deleteStudent(@PathVariable Integer roll){
		
		return new ResponseEntity<String> (stService.deleteStudent(roll), HttpStatus.OK);
	}
	
	@PutMapping("/updateStudent/{marks}")
	public ResponseEntity<Student> updatedStudent(@RequestParam Integer roll, @PathVariable Integer marks){
		return new ResponseEntity<Student>(stService.updateStudent(roll, marks), HttpStatus.OK);
	}
}
