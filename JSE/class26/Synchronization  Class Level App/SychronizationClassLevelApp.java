package com.google.app;
import com.google.ex.*;

public class SychronizationClassLevelApp
	{
public static void main(String args[])
{

PrintTable table1 = new PrintTable();
PrintTable table2 = new PrintTable();

SampleThread t1 = new SampleThread(table1,1);
t1.setName(" Thread 1 ");
t1.start();

SampleThread t2 = new SampleThread(table1,2);
t2.setName(" Thread 2 ");
t2.start();

SampleThread t3 = new SampleThread(table2,3);
t3.setName(" Thread 3 ");
t3.start();

SampleThread t4 = new SampleThread(table2,4);
t4.setName(" Thread 4 ");
t4.start();


}
	}