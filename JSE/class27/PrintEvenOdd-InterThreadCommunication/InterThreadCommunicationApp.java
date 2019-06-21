package com.google.app;
import com.google.ex.PrintNumbers;
import com.google.ex.OddThread;
import com.google.ex.EvenThread;

public class InterThreadCommunicationApp
	{
public static void main(String args[])
{
	PrintNumbers pnum = new PrintNumbers();

	OddThread  t1 = new OddThread(pnum);
	t1.setName(" ODD Thread ");
	t1.start();

	EvenThread  t2 = new EvenThread(pnum);
	t2.setName(" EVEN Thread");
	t2.start();
	
}
	}

