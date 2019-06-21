package com.google.ex;
public class SampleThread implements Runnable
	{
public void run()
{
	int i = 1;
	while( i <= 5)
	{
		try
		{
		Thread.sleep(1000);
		}catch(Exception exp)
		{
		System.out.println(exp);
		}
	System.out.println(Thread.currentThread().getName() + " : "+i);
	i++;
	}
}
	}