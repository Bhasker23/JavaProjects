package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.functionalInterface.Student;

public class PredicateTest {
	
	public static void main(String[] args) {
		
		
		Predicate<Integer> predicate = i -> i> 5;

//		test() is only a abstract method present in Predicate which return a boolean value based on predicated situation.
		
		System.out.println(predicate.test(3));
		
		
		List<Student> students=new ArrayList<>();
		
		students.add(new Student(10, "Ram", 650));
		students.add(new Student(12, "Shyam", 750));
		students.add(new Student(13, "Sumit", 550));
		students.add(new Student(14, "Rahul", 820));
		students.add(new Student(15, "Ravi", 720));
		students.add(new Student(16, "Lakhan", 620));
		
//		 Removing the Students from the List whose marks is less than 700
//		 remove if method is added in Java8 in collection Interface which take predicate as a argument.
		
		System.out.println(students);
		
		students.removeIf( student -> student.getMarks() < 700);
		
		System.out.println(students);
		
	}
}
