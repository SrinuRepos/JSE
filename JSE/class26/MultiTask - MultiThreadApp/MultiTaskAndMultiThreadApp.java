package com.google.app;
import com.google.ex.*;

public class MultiTaskAndMultiThreadApp
	{
public static void main(String args[])
{
PrintNumbers pnum = new PrintNumbers();

PrintEvenThread t1 = new PrintEvenThread(pnum);
t1.setName("EvenThread");
t1.setPriority(Thread.MAX_PRIORITY); // MAX_PRIORITY = 10

PrintOddThread t2 = new PrintOddThread(pnum);
t2.setName("OddThread");
t2.setPriority(Thread.NORM_PRIORITY); // NORM_PRIORITY = 5

t1.start();
t2.start();



}
	}