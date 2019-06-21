package com.google.ex;

public class OddThread extends Thread
	{
private PrintNumbers pnum ;

public OddThread(PrintNumbers pnum)
{
	this.pnum = pnum;
}

public void run()
{
	pnum.displayOdd();
}
	}