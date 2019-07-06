package com.google.ex;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class User
	{
Map<Integer,String> map = new HashMap<Integer,String>();

public User()
{
	map.put(1242,"Srinu");
	map.put(1201,"Kiran");
	map.put(1236,"Srinu");
	map.put(1242,"Srinu Np");
	map.put(1289,"Kiran");
	
}

public void printData()
	{
Set<Integer> set = map.keySet();
Iterator<Integer> itr = set.iterator();
while(itr.hasNext())
{

	Integer key = itr.next();
	System.out.println(Thread.currentThread().getName()+": "+key+" : "+map.get(key));
	try
		{
		 Thread.sleep(1000);
		}catch(Exception exp)
			{
		System.out.println(exp);
			}
	itr.remove();
}
	}


	}









