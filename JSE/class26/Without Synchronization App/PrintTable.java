package com.google.ex;

public class PrintTable
	{

public void display(int tableNo)
{

	for(int i = 1 ; i <= 10 ; i++)
	{
	
System.out.println(Thread.currentThread().getName()+ " => "+tableNo + " * " +i+ "  =  "+ (tableNo * i));
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





