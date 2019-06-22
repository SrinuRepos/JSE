package com.google.ex;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class NumberTask implements Callable<String>
	{
private AtomicInteger automicCount = new AtomicInteger(0);

public String call()
{
	
	int n = automicCount.incrementAndGet();
	String name = Thread.currentThread().getName();
	return name + " : => n = "+n;
}
	}