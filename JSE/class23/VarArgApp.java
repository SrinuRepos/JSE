package com.google.app;

class Sample
	{
public void display(String... msg)
{
System.out.println("from display ()");
	for(int i = 0 ; i < msg.length ; i++)
		{
	System.out.println(msg[i]);
		}
}
	}

public class VarArgApp
	{
public static void main(String args[])
{
	Sample s = new Sample();
	System.out.println(" \n Var Arg without Params");
	s.display();
	System.out.println(" \n Var Arg with 1 Param");
	s.display("Srinu");
	System.out.println(" \n Var Arg with 3 Params");
	s.display("Srinu","Kiran","Arup");	
	
}
	}