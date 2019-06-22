class Recursion
	{
public void print(int n)
{
	if( n == 0)
		{
	return;
		}
	
	print(n-1);
System.out.println(n);
	
}

	}


public class RecursionApp
	{
public static void main(String args[])
{
	Recursion r = new Recursion();
	r.print(5);
}
	}











