package com.google.ex;

public class PrintEvenThread extends  Thread
	{
private PrintNumbers pnum = null;

public PrintEvenThread(PrintNumbers pnum)
{
this.pnum = pnum;
}

public void run()
{
	pnum.displayEven();
}

	}
	