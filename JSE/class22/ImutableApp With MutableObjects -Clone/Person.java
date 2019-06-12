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

return address.copyObject();
	}


public String getName()
	{
return name;
	}

	}