
public class FindFirstAndLastDigit
	{
public static void main(String args[])
{
		int n = 12345;
		int first = n % 10;
		int last = n % 10;
		n = n/10;

		while( n > 0)
		{
		 first = n % 10;
		  n = n / 10;
		}

		System.out.println( " First Value ::"+first);
		System.out.println( " Last Value ::"+last);
	
}
	}







