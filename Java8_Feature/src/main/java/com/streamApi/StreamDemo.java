package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static int hello(int x) {
		int num = x * x;
//		System.out.println("this method is calling from stream map method");
		return num;
	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 2);

		System.out.println(list.stream().map(x -> x * x).collect(Collectors.toSet()));

		System.out.println(list.stream().sorted().collect(Collectors.toSet()));

		System.out.println(list.stream().filter(x -> x <= 5).collect(Collectors.toList()));

		System.out.println(list.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i));

		System.out.println(list.stream().map(x -> StreamDemo.hello(x)).collect(Collectors.toList()));

		list.stream().forEach(x -> System.out.println(x));
	}
}
