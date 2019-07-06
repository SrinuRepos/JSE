package com.google.ex;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.Iterator;

public class User
	{
ConcurrentMap<Integer,String> map = new ConcurrentHashMap<Integer,String>();

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









