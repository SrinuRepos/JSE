package com.google.app;
import com.google.ex.*;

public class WithoutSychronizationApp
	{
public static void main(String args[])
{

PrintTable table = new PrintTable();

SampleThread t1 = new SampleThread(table,1);
t1.setName(" Thread 1 ");
t1.start();

SampleThread t2 = new SampleThread(table,2);
t2.setName(" Thread 2 ");
t2.start();

SampleThread t3 = new SampleThread(table,3);
t3.setName(" Thread 3 ");
t3.start();


}
	}