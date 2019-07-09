package com.google.ex;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingDataFromMultipleFiles
	{
public static void main(String args[])
{	
		try
	{
InputStream fin1 = new FileInputStream("one.txt");
InputStream fin2 = new FileInputStream("WritingDataToAFile.java");
InputStream seq = new SequenceInputStream(fin1,fin2);
		int i;
		while( (i = seq.read()) != -1)
		{
		System.out.print((char)i);
		}
	seq.close();
	fin1.close();
	fin2.close();
	}catch(IOException exp)
		{
	System.out.println(" Exception Raised ::"+exp);
		}
}
	}


