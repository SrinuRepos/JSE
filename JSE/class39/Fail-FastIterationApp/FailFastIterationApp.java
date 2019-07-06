package com.google.app;

import com.google.ex.ConcurrentThread;
import com.google.ex.User;

public class FailFastIterationApp
	{
public static void main(String args[])
{
	User user = new User();

	ConcurrentThread t1 = new ConcurrentThread(user);
	t1.setName(" Thread 1");
	ConcurrentThread t2 = new ConcurrentThread(user);
	t2.setName(" Thread 2");

	t1.start();
	t2.start();
}
	}