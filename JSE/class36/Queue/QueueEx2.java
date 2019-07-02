package com.google.ex;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

public class QueueEx2
	{
public static void main(String args[])
{
	Queue<Integer> queue = new PriorityQueue<Integer>();
	queue.offer(12);
	queue.offer(13);
	queue.offer(1);
	queue.offer(26);
	queue.offer(14);
	queue.offer(2);
	queue.offer(12);
	
	System.out.println(" \n\n=> Elements in Queue "+queue);

		queue.remove();
	System.out.println(" => After 1st remove Elements in Queue "+queue);

	queue.remove();
	System.out.println(" => After 2nd remove Elements in Queue "+queue);


	
	
}
	}






