package com.google.ex;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class WritingDataToAMultipleFiles
	{
public static void main(String args[])
{	
		try
	{
	String msg = " Welcome to Data Geeks !!! Srinu NP ";
	byte[] msgArr = msg.getBytes();

	OutputStream out1 = new FileOutputStream("1.txt");
	OutputStream out2 = new FileOutputStream("2.txt");
	ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
	byteOut.write(msgArr);
	byteOut.writeTo(out1);
	byteOut.writeTo(out2);
	byteOut.flush();
	byteOut.close();
	out2.close();
	out1.close();
	System.out.println(" Data Transfer done to a files !!! ");
	}catch(IOException exp)
		{
	System.out.println(" Exception Raised ::"+exp);
		}
}
	}


