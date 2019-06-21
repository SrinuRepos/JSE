package com.google.app;
import com.google.ex.SampleThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class  ExecutorFramework
	{
public static void main(String args[])
{
	SampleThread r1 = new SampleThread();
	SampleThread r2 = new SampleThread();
	SampleThread r3 = new SampleThread();
	SampleThread r4 = new SampleThread();
	SampleThread r5 = new SampleThread();

	ExecutorService  service = Executors.newFixedThreadPool(3);
	service.execute(r1);
	service.execute(r2);
	service.execute(r3);
	service.execute(r4);
	service.execute(r5);
	
	
	service.shutdown();
	
}
	}

