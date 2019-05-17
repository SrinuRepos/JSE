
public class PrintPrimeNumbers
	{
public static void main(String args[])
	{
		int n = 2;
		while(n <= 100)
		{

		int count = 0;
		int i= 1;
		while( i<= n)
			{
			   if( n % i == 0)
				{
				count++;
				}
			i++;
			}
		if( count == 2)
			{
		System.out.println(n);
			}	
		n++;
		}
		
			
	}
	}







