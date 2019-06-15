package com.google.app;
import com.google.ex.SampleThread;

public class SingleTaskMultiThreadApp
	{
public static void main(String args[])
{
	SampleThread t1 = new SampleThread();
	t1.setName("SampleThread1");
System.out.println(" from main() ::SampleThread1 State : "+t1.getState());
	t1.run();

	SampleThread t2 = new SampleThread();
	t2.setName("SampleThread2");
System.out.println("from main() :: SampleThread2 State : "+t2.getState());
	t2.run();
}
	}


