package com.google.app;
import com.google.ex.SampleThread;

public class RunnableThreadApp
	{
public static void main(String args[])
{
	SampleThread s = new SampleThread();
	Thread t1 = new Thread(s);
	t1.start();
}
	}


