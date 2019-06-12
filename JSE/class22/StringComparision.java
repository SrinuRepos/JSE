package com.google.ex;

public class StringComparision
	{
public static void main(String args[])
{
	String s1 = "Welcome";
	String s2 = "Welcome";
	String s3 = new String("Welcome");
	String s4 = new String("Welcome");
	String s5 = "Welcome To Hyd";

	String s6 = "WelcOME";

	System.out.println(" s1.equals(s2) "+ s1.equals(s2) ); //true	
	System.out.println(" s3.compareTo(s4) "+ s3.compareTo(s4) );//0
	System.out.println(" s3.equals(s4) "+ s3.equals(s4) ); // true
	System.out.println(" s3 == s4 "+ (s3 == s4) );//false
	System.out.println(" s1.equals(s5) "+ s1.equals(s5) ); //false
	System.out.println(" s1.compareTo(s5) "+ s1.compareTo(s5) ); //-ve
	System.out.println(" s1.equals(s6) "+ s1.equals(s6) ); //false
System.out.println(" s1.equalsIgnoreCase(s6) "+ s1.equalsIgnoreCase(s6) ); //true
	
}
	}