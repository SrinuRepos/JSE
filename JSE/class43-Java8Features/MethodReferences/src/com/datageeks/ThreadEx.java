package com.datageeks;

public class ThreadEx {
	
	public static void main(String[] args) {
		
		Thread t = new Thread( Test ::printRun );
		t.start();
	}

}

class Test
{
	public static void printRun()
	{
		System.out.println(" Thread is Running !!!!");
	}
}