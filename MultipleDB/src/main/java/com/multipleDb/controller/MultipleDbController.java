package com.multipleDb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multipleDb.db1entity.Student;
import com.multipleDb.db2entity.Product;
import com.multipleDb.service.ProductImpl;
import com.multipleDb.service.Studentimpl;

@RestController
@RequestMapping("/multipleDb")
public class MultipleDbController {

	@Autowired
	private ProductImpl productInr;
	
	@Autowired
	private Studentimpl studentimpl;
	
	@PostMapping("/addProduct")
	public ResponseEntity<Product> addProduct(Product product){
		return new ResponseEntity<Product>(productInr.addProduct(product), HttpStatus.OK);
	}
	
	@PostMapping("/addStudent")
	public ResponseEntity<Student> addStudent(Student student){
		return new ResponseEntity<Student>(studentimpl.addStudent(student), HttpStatus.OK);
	}
}
