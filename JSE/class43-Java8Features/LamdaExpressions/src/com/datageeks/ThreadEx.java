package com.datageeks;

public class ThreadEx {
	
	public static void main(String[] args) {
		
		Runnable r = () ->
						{
					System.out.println(" Thread is Running !!!");
					System.out.println(" Thread Name "+Thread.currentThread().getName());
						};
		Thread t = new Thread(r);
		t.setName("Lamda Thread");
		t.start();
	}

}
