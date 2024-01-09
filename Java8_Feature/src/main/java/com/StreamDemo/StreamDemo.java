package com.StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.functionalInterface.Student;

public class StreamDemo {

//	Top 3 higest marks
	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "Bhasker", 900));
		list.add(new Student(2, "Gopal", 680));
		list.add(new Student(3, "Hari", 700));
		list.add(new Student(4, "Shyam", 880));

		Collections.sort(list, new MarksComapre());
//		System.out.println(list.get(2));

		int topNumber = 2;

//	top 3rd Student
		List<Student> list2 = list.stream().sorted(new MarksComapre()).skip(topNumber).limit(1)
				.collect(Collectors.toList());

//	printing top 3rd student through new stream for practice
		list2.stream().forEach(System.out::println);

//		printing the student after updating its marks.
		list2.stream().map((x) -> x.getMarks() + 30).forEach(System.out::println);

	}

}

class MarksComapre implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return arg1.getMarks() - arg0.getMarks();
	}

}
