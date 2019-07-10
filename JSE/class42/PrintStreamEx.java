package com.google.ex;
import java.io.PrintStream;


public class PrintStreamEx
	{
public static void main(String args[]) throws Exception
{
	PrintStream out = new PrintStream(System.console());
	out.println(1242);
	out.println(false);
	out.println("Srinu");
	out.println(1500.50f);
	
	System.out.println(" Data Transfer is Done ");
}

	}