public class SumOfOddNumbers
	{
public static void main(String args[])
{
	int n = 10;
	int i = 1;
	int sum = 0;

	while( i <= n)
		{
			if( i%2 == 1)
			{
			sum = sum+i;
			}
		
		i++;
		}
	System.out.println(" Sum of first "+n+"  Odd digits is "+sum);
}
	}