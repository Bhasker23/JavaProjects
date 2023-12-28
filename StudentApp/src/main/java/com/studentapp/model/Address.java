package com.studentapp.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Address {

	private String city;
	private String state;
	private Integer pincode;
	
}
