package com.google.ex;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class BufferedInputStreamApp
	{
public static void main(String args[])
{	
		try
	{
	InputStream fin = new FileInputStream("one.txt");
	BufferedInputStream bufin = new BufferedInputStream(fin);
		int i;
		while( (i = bufin.read()) != -1)
		{
		System.out.print((char)i);
		}
	bufin.close();
	fin.close();
	}catch(IOException exp)
		{
	System.out.println(" Exception Raised ::"+exp);
		}
}
	}


