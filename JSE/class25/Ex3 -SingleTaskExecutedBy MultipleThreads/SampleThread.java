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
	i++;
	}
}
	}