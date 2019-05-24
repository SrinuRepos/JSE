public class SumOfNaturalNumbers
	{
public static void main(String args[])
{
	int n = 20;
	int i = 1;
	int sum = 0;

	while( i <= n)
		{
		sum = sum+i;
		i++;
		}
	System.out.println(" Sum of first 20 digits is "+sum);
}
	}