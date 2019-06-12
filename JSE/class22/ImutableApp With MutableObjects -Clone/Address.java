package com.google.ex;

public class Address implements Cloneable
	{

private  String city;

public Address()
{
}

public Address(String city)
	{
this.city = city;
	}

public void setCity(String city)
{
	this.city = city;
}

public String getCity()
	{
return city;
	}

public Address copyObject()
{
	Address a2 = null;
	try
	{
	a2 = (Address) super.clone();	
	}catch(CloneNotSupportedException exp)
	{
	System.out.println(exp);
	}
return a2;
}
	}






