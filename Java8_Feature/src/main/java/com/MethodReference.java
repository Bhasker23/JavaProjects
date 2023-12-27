package com;


interface Sayable{  
    void say();  
}  
public class MethodReference {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public void againSay() {
    	System.out.println("Hello, this is non-static method.");  
    }
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = MethodReference::saySomething;  
        // Calling interface method  
//        sayable.say(); 
        sayable.say();
        
        MethodReference mt = new MethodReference();
        Sayable sayable2 = mt::againSay;
        sayable2.say();
    }  
}  