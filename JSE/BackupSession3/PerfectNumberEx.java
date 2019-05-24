public class PerfectNumberEx
	{
public static void main(String args[])
{
	 int n = 28;
	int sum = 0;

	int i = 1;

	while( i < n)
		{
			if(n % i == 0)
			{
			   sum = sum + i;
			}
		i++;
		}
	if( sum == n)
		{
	System.out.println(" Given No  "+ n +" is Perfect Number");
		}
	else
		{
	System.out.println(" Given No  "+ n +" is not a Perfect Number");
		}
}
	}