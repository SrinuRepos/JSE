package com.google.ex;

enum Paradise
	{
LOCATION("Hyd"), BRANCHES(15), BIRYANICOST(200);
private Object value;

Paradise(Object value)
{
	System.out.println(" Paradise Enum Parameterized Constructor");
	this.value = value;
}

public Object getValue()
{
	return value;
}
	}


enum PistaHouse
	{
LOCATION("Hyd"), BRANCHES(10), BIRYANICOST(250);
private Object value;

PistaHouse(Object value)
{
	System.out.println(" PistaHouse Enum Parameterized Constructor");
	this.value = value;
}

public Object getValue()
{
	return value;
}
	}


public class SwiggyApp
	{
public static void main(String args[])
{
	System.out.println(" PISTHOUSE LOCATION : "+PistaHouse.LOCATION.getValue());
	System.out.println(" PISTHOUSE Branches : "+PistaHouse.BRANCHES.getValue());
	System.out.println(" PISTHOUSE BIRYANICOST: "+PistaHouse.BIRYANICOST.getValue());
	
	System.out.println("\n\n");
		
	System.out.println(" Paradise LOCATION : "+Paradise.LOCATION.getValue());
	System.out.println(" Paradise Branches : "+Paradise.BRANCHES.getValue());
	System.out.println(" Paradise BIRYANICOST: "+Paradise.BIRYANICOST.getValue());

}
	}


