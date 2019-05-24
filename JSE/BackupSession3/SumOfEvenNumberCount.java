public class SumOfEvenNumberCount
	{
public static void main(String args[])
{
	int n = 3;
	int count = 0;
	int sum = 0;
	int i = 1;
	while( count < n)
		{
			if( i%2 == 0)
			{
			sum = sum+i;
			count++;
			}
		i++;
		
		}
	System.out.println(" Sum of first "+n+" digits is "+sum);
}
	}