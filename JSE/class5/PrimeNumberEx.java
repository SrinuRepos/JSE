public class PrimeNumberEx
	{
public static void main(String args[])
{
	
		int n = 5;
		int count = 0;
		int i = 1;
			while( i <= n)
				{
				if( n % i == 0 )
					{
					count++;
					}
				i++;
				} // end of while
		if( count == 2)
		{
			System.out.println(" Given Number is Prime n = "+n);
		}else
		{
			System.out.println(" Given Number is Not Prime n = "+n);
		}
}
	}