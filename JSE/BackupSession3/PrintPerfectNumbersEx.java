public class PrintPerfectNumbersEx
	{
public static void main(String args[])
{
	int n = 500;	
	int p = 2;
	
	while( p <= n)
		{

		int sum = 0;
		int i = 1;
		while( i < p)
			{
			    if( p % i == 0)
				{
				 sum = sum+i;
				}
			i++;
			}
		if( sum == p)
			{
		System.out.println(p);
			}
	
	p++;
		}
	
	

}
	}