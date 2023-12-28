package com.studentapp.exceptionhandler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(StudentException.class)
	public ResponseEntity<ExceptionDetails> StudentException(StudentException studentException, WebRequest wr){
		
		ExceptionDetails ex = new ExceptionDetails();
		ex.setMessage(studentException.getMessage());
		ex.setDesc(wr.getDescription(false));
		ex.setDate(LocalDateTime.now());
		
		return new ResponseEntity<>(ex, HttpStatus.NOT_FOUND);
		
		
	}
	
}
