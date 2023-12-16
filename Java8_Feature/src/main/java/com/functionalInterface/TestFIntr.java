package com.functionalInterface;

public class TestFIntr{

    public static void main(String[] args) {

        //        without Lambda expression.
        FInterface find = new FInterface() {
            @Override
            public int calculateSquare(int a) {
                return a*a;
            }
        };
        System.out.println(find.calculateSquare(5));
    }
}
