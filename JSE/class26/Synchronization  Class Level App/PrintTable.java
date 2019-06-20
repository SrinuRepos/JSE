package com.google.ex;

public class PrintTable
	{

public static synchronized void display(int tableNo)
{

System.out.println(Thread.currentThread().getName() + "Entered to display() method" );
	for(int i = 1 ; i <= 10 ; i++)
	{
System.out.println(tableNo + " * " +i+ "  =  "+ (tableNo * i));
	
		try
		{
		Thread.sleep(1000);
		}catch(InterruptedException exp)
		{
		System.out.println(exp);
		}
	}

}
	}





