package com.google.ex;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class SortApplication
	{
public static void main(String args[])
{
	List<Integer> list = new LinkedList<Integer>();
	list.add(12);
	list.add(1);
	list.add(13);
	list.add(7);	
	list.add(14);
	list.add(9);
	list.add(17);
	list.add(18); 

	System.out.println(" Before Sort : list "+list);
	Collections.sort(list);
	System.out.println(" After Sort : list "+list);
	
}
	}







