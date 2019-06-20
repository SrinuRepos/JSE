package com.google.ex;

public class PrintOddThread extends  Thread
	{

private PrintNumbers pnum =  null;

public PrintOddThread(PrintNumbers pnum)
{
this.pnum = pnum;
}

public void run()
{
	pnum.displayOdd();
}


	}
	