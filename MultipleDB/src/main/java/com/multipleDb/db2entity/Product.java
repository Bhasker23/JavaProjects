package com.multipleDb.db2entity;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	private Integer id;
	private String name;
	
}
