package com.studentapp.exceptionhandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(StudentException.class)
	public ResponseEntity<ExceptionDetails> StudentException(StudentException studentException, WebRequest wr){
		
		ExceptionDetails ex = new ExceptionDetails();
		ex.setMessage(studentException.getMessage());
		ex.setDesc(wr.getDescription(false));
		ex.setDate(LocalDateTime.now());
		
		return new ResponseEntity<>(ex, HttpStatus.NOT_FOUND);
		
		
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleMethodArgsNotValidException(MethodArgumentNotValidException ex)
    {
        Map<String, String> respMap=new HashMap<String, String>();
        ex.getBindingResult().getAllErrors().forEach(error->{
            String field= ((FieldError)error).getField();
            
            String message=error.getDefaultMessage();
            
            respMap.put(field, message);
            
        });
        
        return new ResponseEntity<Map<String,String>>(respMap,HttpStatus.BAD_REQUEST);
        
    }

	
}
