package com.google.ex;

public class StringMethodsEx
	{
public static void main(String args[])
{
String s = "Welcome";
String m = "Welcome Srinu Come Here";

System.out.println("\n s  = "+s);
System.out.println("\n m  = "+m);
System.out.println("\n s.length() : "+s.length()); // 7

System.out.println("\n s.isEmpty(): "+s.isEmpty()); // false

System.out.println("\n s.charAt(3): "+s.charAt(3)); // c

System.out.println("\n s.contentEquals(m) ? : "+s.contentEquals(m)); //false

System.out.println("\n s.startsWith(Wel): "+s.startsWith("Wel")); // true

System.out.println("\n m.endsWith(Srinu): "+m.endsWith("Srinu")); // true

System.out.println("\n m.indexOf(e): "+m.indexOf("e")); // 1
System.out.println("\n m.indexOf(e,2): "+m.indexOf("e",2)); //6

System.out.println("\n m.lastIndexOf(e): "+m.lastIndexOf("e")); // 22

System.out.println("\n m.subString(8): "+m.substring(8)); // Srinu Come Here

System.out.println("\n m.subString(8,13): "+m.substring(8,13)); // Srinu

System.out.println("\n m.replace('H','h'): "+m.replace('H','h')); 
							   // Srinu Come here

System.out.println("\n m.contains(Srinu): "+m.contains("Srinu")); //true

System.out.println("\n m.replace(Srinu,SRINU): "+m.replace("Srinu","SRINU"));                                                     //Welcome SRINU Come Here


String test = String.join(",","Srinu","Kiran","Anurup");
System.out.println("\njoin output  :: "+test); // Srinu,Kiran,Anurup

String[] testArr = test.split(",");
System.out.println("\n After split");
for(int i = 0 ; i < testArr.length ; i++)
	{
System.out.println(testArr[i]);
	}

System.out.println("\n m.toLowerCase() "+m.toLowerCase());
System.out.println("\n m.toUpperCase() "+m.toUpperCase());

String p = " Hi ";
System.out.println("\n p = "+p);
System.out.println("\n p length without trim() "+ p.length()); //4
System.out.println("\n p length with trim() "+ p.trim().length());//2

System.out.println("\n toCharArray() ex : ");
char[] ch = s.toCharArray();
	for(int i = 0 ; i < ch.length ; i++)
	{
	System.out.println(ch[i]);
	}


System.out.println("\n String.valueOf(124.45) "+String.valueOf(124.45));

}
	}