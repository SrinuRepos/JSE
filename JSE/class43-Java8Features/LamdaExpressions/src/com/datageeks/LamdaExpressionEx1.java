package com.datageeks;

public class LamdaExpressionEx1 {

	public static void main(String[] args) {
		/*
		Sample s = new Sample() {
			
			@Override
			public String getInfo(String messgage) {
				
				return " From Annonymous Inner class : "+messgage;
				
			}
		};
		System.out.println(s.getInfo(" Hi How are You?"));
		*/
		
		
		
		Sample s1 = (String message) -> {
					System.out.println(" \n\n Implementing Using Lamda Expressions");
					return " From Lamda Expressions EX1 : "+message;
					};
			System.out.println(s1.getInfo(" Hi From Naresh"));
	}
}
