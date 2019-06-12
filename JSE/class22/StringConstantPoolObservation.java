package com.google.ex;

public class StringConstantPoolObservation
	{
public static void main(String args[])
{
	String s1 = "Welcome";
	String s2 = "Welcome";
	String s3 = new String("Welcome");
	String s4 = new String("Welcome");

	System.out.println(" s1 == s2 "+ (s1 == s2) );
	System.out.println(" s1 == s3 "+ (s1 == s3) );
	System.out.println(" s3 == s4 "+ (s3 == s4) );
	
}
	}