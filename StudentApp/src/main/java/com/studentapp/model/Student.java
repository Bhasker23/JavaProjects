package com.studentapp.model;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer roll;
	private String name;
	private Integer standard;
	private Integer marks;
	private String email;
	@Embedded
	private Address address;
	

}
