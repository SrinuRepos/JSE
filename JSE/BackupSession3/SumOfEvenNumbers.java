public class SumOfEvenNumbers
	{
public static void main(String args[])
{
	int n = 15;
	int i = 1;
	int sum = 0;

	while( i <= n)
		{
			if( i%2 == 0)
			{
			sum = sum+i;
			}
		
		i++;
		}
	System.out.println(" Sum of first "+n+" digits is "+sum);
}
	}