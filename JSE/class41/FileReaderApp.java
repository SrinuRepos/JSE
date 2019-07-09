package com.google.ex;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderApp
	{
public static void main(String args[])
{	
		try
	{
	FileReader fin = new FileReader("1.txt");
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


