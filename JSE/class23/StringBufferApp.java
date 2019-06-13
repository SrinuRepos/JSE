package com.google.app;


public class StringBufferApp
	{
public static void main(String args[])
{
	StringBuffer sb = new StringBuffer("  Srinu ");
	System.out.println("\n\n Before Update sb  ="+sb);

	sb.append(" Welcome");
	System.out.println("\n\n After Update sb  ="+sb);

	

	System.out.println("\n insert(0, 1242) => "+ sb.insert(0,1242));

	System.out.println("\n\n Reverse   ="+sb.reverse());
	
	
}

	}