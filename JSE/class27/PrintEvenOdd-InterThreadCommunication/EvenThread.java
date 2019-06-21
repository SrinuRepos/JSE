package com.google.ex;

public class EvenThread extends Thread
	{
private PrintNumbers pnum ;

public EvenThread(PrintNumbers pnum)
{
	this.pnum = pnum;
}

public void run()
{
	pnum.displayEven();
}
	}