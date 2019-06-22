class Factorial
	{
public int fact(int n)
{
	if( n == 1)
		{
	return 1;
		}
	return n  * fact(n-1);	
}

	}


public class RecursionFactorialApp
	{
public static void main(String args[])
{
	Factorial f = new Factorial();
	int result = f.fact(5);
	System.out.println(" Factorial is ::"+result);
}
	}











