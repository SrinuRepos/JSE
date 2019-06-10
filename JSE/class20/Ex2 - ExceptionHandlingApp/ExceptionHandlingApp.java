package com.google.ex;

public class ExceptionHandlingApp
	{
public static void main(String args[])
{
	System.out.println(" Statement 1 ");
	System.out.println(" Statement 2 ");
	System.out.println(" Statement 3 ");
	System.out.println(" Statement 4 ");
	System.out.println(" Statement 5 ");

	try
	{
	 	int c = 10/0;
	}catch(ArithmeticException exp)
		{
	System.out.println("From catch :: Dear User You can not devide a number by Zero");
		}

	System.out.println(" Statement 6 ");
	System.out.println(" Statement 7 ");
	System.out.println(" Statement 8 ");
	System.out.println(" Statement 9 ");
	System.out.println(" Statement 10 ");
}
	}