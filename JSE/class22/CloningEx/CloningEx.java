package com.google.app;
import com.google.ex.Address;


public class CloningEx
	{
public static void main(String args[])
{
	Address addr1  = new Address("HYD","Nallagandla");
	Address addr2 = addr1.copyObject();
	
	
	addr2.setStreet(" KPHP ");

	System.out.println("\n Address1 Data ::");
	System.out.println(" City   ::"+ addr1.getCity());
	System.out.println(" Street ::"+ addr1.getStreet());

	System.out.println("\n Address2 Data ::");
	System.out.println(" City   ::"+ addr2.getCity());
	System.out.println(" Street ::"+ addr2.getStreet());
	
	
	
}

	}







