package com.datageeks;

public class LamdaExpressionEx2 {
	
	public static void main(String[] args) {
		
		Demo d = (a,b) -> a+b;
		
		System.out.println(" ADD "+d.add(10, 20));
		
	}

}
