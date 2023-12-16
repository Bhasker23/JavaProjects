package com.supplier;

import java.util.function.Supplier;

import com.functionalInterface.Student;

public class SupplierTest {
	
	public static void main(String[] args) {
		
//		It represents a public void T get() which does not take in any argument but produces a value of type T.
		
		Supplier<Student> supplier = () -> new Student(1, "Amit", 860);
		
		System.out.println(supplier.get());
	}

}
