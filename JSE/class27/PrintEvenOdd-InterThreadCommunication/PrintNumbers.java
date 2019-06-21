package com.google.ex;
public class PrintNumbers
	{
private int n = 10;
private volatile int i = 1;
private volatile boolean isOdd = true;

public synchronized void displayOdd()
{
	while( i <= n)
	{
		if(isOdd)
		{
	System.out.println(Thread.currentThread().getName()+ " : "+i);
	i = i + 1;
	isOdd = false;
	notify();
	try
	{
	Thread.sleep(1000);
	}catch(Exception exp)
	  {
	System.out.println(exp);
	  }
		}
	else
		{
	try
	{
		wait();
	}catch(Exception exp)
	   {
	System.out.println(exp);
	   }
		}
	}
}


public synchronized void displayEven()
	{
		while( i <= n)
		{
		   	if(isOdd)
			{
			  try
			{
				wait();
			}catch(Exception exp)
	  			 {
				System.out.println(exp);
	  			 }
			}else
			{
	System.out.println( Thread.currentThread().getName()+" : "+i);
		i = i + 1;
		isOdd = true;
		notify();
		try
		{
		Thread.sleep(1000);
		}catch(Exception exp)
	  		{
		System.out.println(exp);
	  		}
			}
		}
		
	}



	}