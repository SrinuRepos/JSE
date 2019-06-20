
public class PrintPrimeNumbersCount
	{
public static void main(String args[])
	{
		int n = 2;
		int primeCount = 0;
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
		 primeCount++;
			}	
		n++;
		}
	System.out.println(" Prime Numbers Count till 100 is "+primeCount);
			
	}
	}







