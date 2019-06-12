package com.google.ex;

public class Address implements Cloneable
	{

private  String city;
private String street;

public Address()
{
}

public Address(String city,String street)
	{
this.city = city;
this.street = street;
	}

public void setCity(String city)
{
	this.city = city;
}

public void setStreet(String street)
	{
this.street = street;
	}

public String getCity()
	{
return city;
	}

public String getStreet()
	{
return street;
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






