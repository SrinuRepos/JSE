package com.google.ex;

public class PrintNumbers
	{
private int n = 10;

public void displayOdd()
{
for(int i = 1 ; i <= 10 ; i++)
		{
	if( i % 2 == 1)
	{
	System.out.println(Thread.currentThread().getName() + " : "+i);
	}
		}
}

public void displayEven()
{
for(int i = 1 ; i <= 10 ; i++)
		{
	if( i % 2 == 0)
	{
	System.out.println(Thread.currentThread().getName() + " : "+i);
	}
		}
}
	}