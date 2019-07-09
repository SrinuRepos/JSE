package com.google.ex;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterApp
	{
public static void main(String args[])
{	
		try
	{
	FileWriter fw= new FileWriter("11.txt");
		String msg = " Hi GoodEvening";
	 fw.write(msg);
	fw.close();
	System.out.println(" Data Transfer is Done");
	}catch(IOException exp)
		{
	System.out.println(" Exception Raised ::"+exp);
		}
}
	}


