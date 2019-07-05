package com.google.ex;

import java.util.Vector;

public class  VectorEx
	{
public static void main(String args[]) throws Exception
{
	Vector<Integer> v = new Vector<Integer>();
	v.add(12);
	v.add(13);
	v.add(14);
	v.add(15);	
		
	
	for(Integer e : v)
	{
	System.out.println(e);
	}

	// you can also make use of Enumeration , Iterator

}

	}








