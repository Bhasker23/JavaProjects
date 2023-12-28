package com.studentapp.exceptionhandler;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ExceptionDetails {
	
	private String message;
	private String desc;
	private LocalDateTime date;
	
}
