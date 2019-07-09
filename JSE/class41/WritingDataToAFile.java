package com.google.ex;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingDataToAFile
	{
public static void main(String args[])
{	
		try
	{
	String msg = " Welcome to Data Geeks !!!";
	OutputStream out = new FileOutputStream("one.txt");
	byte[] msgArr = msg.getBytes();
	out.write(msgArr);
	out.flush();
	out.close();
	System.out.println(" Data Transfer done to a file");
	}catch(IOException exp)
		{
	System.out.println(" Exception Raised ::"+exp);
		}
}
	}


