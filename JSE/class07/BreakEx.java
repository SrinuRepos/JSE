public class BreakEx
{
	public static void main(String args[])
	{
		int i = 1;
		int n = 28;
		int sum = 0;
		while( i < n)
		{

			
			if( i > n/2)
				{
				break;
				}
			System.out.println(" Iteration : "+i);
			if( n % i == 0)
				{
				 sum = sum + i; 
				}
			i++;
		}
		if( sum == n)
			{
		System.out.println(" Given number is perfect number");
			}
		else
		{
		System.out.println(" Given number is not a perfect number");
		}
	}
}
