package com.google.app;
import com.google.ex.Person;
import com.google.ex.Address;


public class ImmutableApp
	{
public static void main(String args[])
{
	Address addr  = new Address("HYD");	
	Person p = new Person("Srinu",addr);
	
	
	System.out.println("\n\n Before Address Update :: Person Data ");
	System.out.println(" Name : "+p.getName());
	System.out.println(" City : "+p.getAddress().getCity());

	Address ad = p.getAddress();
	ad.setCity("Banglore");

	System.out.println("\n\n After Address Update :: Person Data");
	System.out.println(" Name : "+p.getName());
	System.out.println(" City : "+p.getAddress().getCity());
	
}

	}







