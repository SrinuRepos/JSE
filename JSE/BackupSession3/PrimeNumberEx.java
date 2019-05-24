public class PrimeNumberEx
	{
public static void main(String args[])
{
	 int n = 11;
	int count = 0;

	int i = 1;

	while( i <= n)
		{
			if(n % i == 0)
			{
			count++;
			}
		i++;
		}
	if( count == 2)
		{
	System.out.println(" Given No  "+ n +" is Prime");
		}
	else
		{
	System.out.println(" Given No  "+ n +" is Not a Prime");
		}
}
	}