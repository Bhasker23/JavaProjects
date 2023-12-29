package com.studentapp.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Embeddable
@Data
public class Address {

	@NotBlank(message = "City is Mandatory")
	private String city;
	@NotBlank(message = "State is Mandatory")
	private String state;
	private Integer pincode;
	
}
