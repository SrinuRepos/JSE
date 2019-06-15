package com.google.ex;

public class SampleThread extends Thread
	{
public void run()
{
	int i = 1;
   	while( i <= 5)
	{
	Thread t = Thread.currentThread();
	String threadName = t.getName();
System.out.println(threadName +" => i = "+i+"  State : "+t.getState());
		try
		{
	Thread.sleep(1000);
System.out.println(threadName +"   State : "+t.getState());
		}catch(InterruptedException exp)
		{
	System.out.println(exp);
		}
	i++;
	}
}
	}