package com.google.ex;

public class ConcurrentThread extends Thread
{
	private User user = null;

	public ConcurrentThread(User user)
	{
		this.user = user;
	}

	public void run()
	{
			
		user.printData();
	}
}