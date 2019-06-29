package com.google.ex;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListMethodsEx
	{
public static void main(String args[])
{
	List<Integer> list = new LinkedList<Integer>();
	list.add(12);
	list.add(13);
	
	list.add(0,11); 
	System.out.println("before set list "+list);// 11 12 13

	list.set(2,15); 
	System.out.println("before set list "+list);// 11 12 15
	
	list.remove(0); 
	
System.out.println(" after remove 0 index value list "+list);// 12 15

	System.out.println("Index 1 value "+list.get(1)); // 15
	list.add(2,14);
	list.add(3,17);
	list.add(4,18); // 12 ,15 ,14,17,18

	System.out.println("\n\n Enhanced For loop to print elements");
	
		for(Integer e : list)
		{
	System.out.println(e);
		}

	System.out.println("\n\n ListIterator forward direction");
		
	ListIterator<Integer> listItr = list.listIterator();
	while(listItr.hasNext())
	{
	System.out.println(listItr.next());
	}

	System.out.println("\n\n ListIterator backward direction");
	
	while(listItr.hasPrevious())
	{
	System.out.println(listItr.previous());
	}

	System.out.println(" does 18 available "+list.contains(18));
}
	}