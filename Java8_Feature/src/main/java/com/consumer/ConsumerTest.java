package com.consumer;

import java.util.function.Consumer;

import com.functionalInterface.Student;

public class ConsumerTest {

	public static void main(String[] args) {
		
		Consumer<Student> a = s -> {
			System.out.println("Roll : " + s.getId());
			System.out.println("Name : " + s.getName());
			System.out.println("Marks : " + s.getMarks());
		};
		
//		Present in Consumer Interface named accept(T t) takes one argument and produce a result and it does not return anything.
		
		a.accept(new Student(5, "Amit", 750));
	}
}
