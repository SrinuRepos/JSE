package com.google.ex;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2
	{
public static void main(String args[])
{
	List<String> list = new ArrayList<String>();
	
	list.add("Srini");
	list.add("Srini");
	list.add("Srikanth");
	list.add(null);
	System.out.println(" Size of List "+list.size());
System.out.println(" contains 12 =>"+list.contains(12));

	List<String> list2 = new ArrayList<String>();
	list2.add("Kiran");

	list.addAll(list2);

System.out.println(" After adding Collection size "+list.size());

	System.out.println(" \n\nIterating Elements through Iterator");

	Iterator<String> itr =	list.iterator();
	while(itr.hasNext())
	{
	System.out.println(itr.next());
	}

System.out.println(" \n\nIterating Elements through Enhancep For loop");

	for(String e:list)
	{
	System.out.println(e);
	}

}

	}