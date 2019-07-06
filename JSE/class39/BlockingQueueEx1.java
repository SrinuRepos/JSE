package com.google.ex;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueEx1
	{
public static void main(String args[])
{
	BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(4);
	queue.offer(12);
	queue.offer(13);
	queue.offer(14);
	queue.offer(15);

	
	System.out.println(" \n\n Elements in the Queue");
	for(Integer element : queue)
	{
	System.out.println(element);
	}
	
	
	queue.poll();

	System.out.println(" \n\n after removing => "+queue);

	System.out.println(" \n\n peek => "+queue.peek());

}
	}






