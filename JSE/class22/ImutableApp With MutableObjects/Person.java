package com.google.ex;

public  final class Person
	{

private  final String name;
private final Address address;

public Person(String name , Address address)
{
	this. name = name;
	this.address = address;
}

public Address getAddress()
	{
Address a2 = new Address();
a2.setCity(address.getCity());
return a2;
	}


public String getName()
	{
return name;
	}

	}