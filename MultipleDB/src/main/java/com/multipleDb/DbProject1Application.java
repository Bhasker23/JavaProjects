package com.multipleDb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.multipleDb.db1entity")
public class DbProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(DbProject1Application.class, args);
	}

}
