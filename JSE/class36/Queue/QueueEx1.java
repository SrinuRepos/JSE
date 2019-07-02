package com.google.ex;
import java.util.LinkedList;
import java.util.Deque;

public class QueueEx1
	{
public static void main(String args[])
{
	Deque<Integer> queue = new LinkedList<Integer>();
	queue.offer(12);
	queue.add(13);

	
	System.out.println(" \n\n Elements in the Queue");
	for(Integer element : queue)
	{
	System.out.println(element);
	}
	
	System.out.println(" \n\n before adding to first => "+queue);

	queue.offerFirst(11);

	System.out.println(" \n\n after adding to first => "+queue);

	queue.offerLast(21);

	System.out.println(" \n\n after adding to last => "+queue);

	queue.poll();

	System.out.println(" \n\n after removing => "+queue);

	System.out.println(" \n\n peek => "+queue.peek());

	queue.offer(null);
	queue.offer(12);

	System.out.println(" \n\n after null , 12 into queue => "+queue);
}
	}






