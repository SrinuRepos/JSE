package com.google.ex;

import java.util.concurrent.Future;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.ArrayList;

public class CalalbleEx
	{
public static void main(String args[]) throws Exception
{

ExecutorService service = Executors.newFixedThreadPool(10);
 NumberTask  t = new NumberTask();

	int i = 0;
ArrayList< Future<String> >  futureList = 
				new ArrayList< Future<String> >();

	// Adding 100 tasks to the ExecutorService
	while( i < 100)
	{
	
	 Future<String> fut = service.submit(t);
	 futureList.add(fut);
		i++;
	}
	
	// Fetching results from Future object
	for( int j = 0 ; j < futureList.size() ; j++)
		{
		Future<String> fut = futureList.get(j);
			String n = fut.get();
		System.out.println(n);
		}
	
	service.shutdown();
}
	}