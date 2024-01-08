package com.functionalInterface;

public class StudentFunctionalTest {

	void printHello(int a) {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		
		StudentFunctionalInterface intr = s -> {
			System.out.println("Roll : " + s.getId());
			System.out.println("Name : " + s.getName());
			System.out.println("Marks : " + s.getMarks());
		};
		
		intr.printDetails(new Student(1, "Sumit", 780));
		
		
	}
}
