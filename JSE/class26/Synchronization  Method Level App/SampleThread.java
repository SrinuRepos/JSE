package com.google.ex;

public class SampleThread extends  Thread
	{

private PrintTable table =  null;
private int tableNo ;

public SampleThread(PrintTable table, int tableNo)
{
this.table = table;
this.tableNo = tableNo;
}

public void run()
{
	table.display(tableNo);
}


	}
	