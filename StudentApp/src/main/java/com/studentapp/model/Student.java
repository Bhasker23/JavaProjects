package com.studentapp.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roll;

	@NotBlank(message = "Name is mandotaory")
	@NotNull
	@Size(min = 3, message = "Minimum length should be 3")
	private String name;

	@Size(min = 1, max = 12, message = "class should be between 1 to 12")
	private String standard;

//	@Size(min = 0, max = 1000, message = "Marks should be between 0 to 1000")
	private Integer marks;
	
	@Email(regexp = "^[A-Za-z+_.-[0-9]]+@[A-Za-z]+\\.[A-Za-z]{2,}$", message = "Invalid email.")
	private String email;

	@Pattern(regexp = "[6789]{1}[0-9]{9}", message = "Invalid Phone Number")
	@NotNull
	private String mobileNumber;
	@Embedded
	private Address address;

}
