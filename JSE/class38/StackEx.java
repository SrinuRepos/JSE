package com.google.ex;

import java.util.Stack;

public class  StackEx
	{
public static void main(String args[]) throws Exception
{
	Stack<Integer> s = new Stack<Integer>();
		
	s.push(1);
	s.push(2);
	s.push(3);

	System.out.println(" Peek => "+s.peek());
	System.out.println(" Before Delete Stack : "+s);
	Integer e = s.pop();
	System.out.println(" Deleted Element : "+e);

	System.out.println("After Peek => "+s.peek());

	System.out.println(" After Delete Stack : "+s);

	

}

	}








