package com.google.ex;

public class InternEx
	{
public static void main(String args[])
{
  String s = new String("Hi"); // "Hi" object is in heap
  String p = s.intern(); //copy "Hi" into String constant pool then returns it


System.out.println(" s == p "+ (s == p));

	String q = "Hi";

System.out.println(" p == q "+ (p == q));

 
}
	}