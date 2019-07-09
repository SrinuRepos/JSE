package com.google.ex;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingDataFromFile2
	{
public static void main(String args[])
{	
		try
	{
	InputStream fin = new FileInputStream("WritingDataToAFile.java");
		int i;
		while( (i = fin.read()) != -1)
		{
		System.out.print((char)i);
		}
	fin.close();
	}catch(IOException exp)
		{
	System.out.println(" Exception Raised ::"+exp);
		}
}
	}


