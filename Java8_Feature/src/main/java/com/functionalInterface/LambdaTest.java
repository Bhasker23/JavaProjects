package com.functionalInterface;

public class LambdaTest {

    public static void main(String[] args) {

        FInterface find = (a) -> {return a*a;
        };
        System.out.println( find.calculateSquare(5));
    }
}
