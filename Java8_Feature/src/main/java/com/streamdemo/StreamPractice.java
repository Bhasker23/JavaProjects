package com.streamdemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class StreamPractice {
	
	
	public static void main(String[] args) {
		
		
		List<String> fruits = Arrays.asList("Apple","Graps", "Banana", "Mango", "pineapple");
		
		
		/*-------------- Map will transform one kind of data to another kind of data------------------ */
		
		
		fruits.stream().map(String::length).forEach(System.out::println);
		System.out.println();
		
		System.out.println(fruits.stream().map(String::toUpperCase).collect(Collectors.toList()));
		
		System.out.println();
		
		
		
		
		
		/*----------------------Sort method example-----------------------*/
		
		System.out.println("natural sorting : ");
		fruits.stream().sorted().forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("sorting in decending : ");
		fruits.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("sorting based on string length : ");
		fruits.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	
		System.out.println();
		
		
		
		
		
		/*--------------------- Filter method example----------------------- */
		
		System.out.println("Filtering the string whose length > 5 ");
		fruits.stream().filter(str -> str.length() > 5).forEach(System.out::println);
		
		System.out.println();
		
		
		
		
		
		
		/*-------Reduce method gives the summarized result of all the stream--------------- */
		
		List<Integer> num = Arrays.asList(1,2,3,4,5); 
		
		System.out.println("Some of inbuilt method which return reduced answer : ");
		
		int sum  = num.stream().mapToInt(i -> i).sum();
		System.out.println("sum is : " + sum);
		
		System.out.println();
		System.out.println("Multilication of number is : " + num.stream().reduce(1, (a,b) -> (a*b)));
		
		System.out.println("Reducing stream of fruits list and return a fruit based on condition : ");
		System.out.println(fruits.stream().reduce((a,b) -> a.length() > b.length() ? a : b).get());
		
		
		
		
		
		/* -------------------------Map, Filter, reduce all together -------------------*/
		
		System.out.println(("Returning sum value of square from of all even number from num list "+
				num.stream().map(a -> a*a).filter(x ->  x%2 == 0).reduce(0,(a ,b) -> (a+b))));
		
		
		System.out.println();
		
		System.out.println("Returning the fruit name which has shortest length");
		System.out.println(
		fruits.stream().min(Comparator.comparing(String :: length)).get());
		
		System.out.println();
		System.out.println("Returning the fruit name which has longest length");
	    System.out.println(fruits.stream().max(Comparator.comparing(String::length)).get());
		
		
		
	}
	

}
