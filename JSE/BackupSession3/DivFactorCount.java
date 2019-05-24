public class DivFactorCount
	{
public static void main(String args[])
{
	 int n = 6;
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
	System.out.println(" Div Factor Count For "+n+ " is "+count);
}
	}