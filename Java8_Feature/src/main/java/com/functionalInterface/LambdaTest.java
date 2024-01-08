package com.functionalInterface;

interface hello{
	void hello();
}
public class LambdaTest {

	public static int calculateAgain(int a) {
		System.out.println("calculating a+a = ");
		return a+a;
	}
	
    public static void main(String[] args) {

        FInterface find = (a) -> {return a*a;
        };
        System.out.println( find.calculateSquare(5));
    
        
        FInterface findAgain = LambdaTest::calculateAgain;
        System.out.println(findAgain.calculateSquare(2));
    }
    
    
}
