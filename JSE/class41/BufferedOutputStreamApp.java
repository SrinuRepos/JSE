package com.google.ex;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOutputStreamApp
	{
public static void main(String args[])
{	
		try
	{
	String msg = " Welcome to Data Geeks !!! BufferedOutputStream";
	OutputStream out = new FileOutputStream("one.txt");
	BufferedOutputStream bfout = new BufferedOutputStream(out);
	byte[] msgArr = msg.getBytes();
	bfout.write(msgArr);
	bfout.flush();
	bfout.close();
	out.close();
	System.out.println(" Data Transfer done to a file");
	}catch(IOException exp)
		{
	System.out.println(" Exception Raised ::"+exp);
		}
}
	}


