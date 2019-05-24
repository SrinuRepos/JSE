public class PrintPrimeNumbersEx
	{
public static void main(String args[])
{
	int n = 100;

	int p = 2;
	
	 while( p <= n)
		{
			int count = 0;
			int i = 1;
				while( i <= p)
				{
					if( p % i == 0)
					{
					count++;
					}
				i++;
				}
			if(count == 2)
			{
			System.out.println(p);
			}
			
		p++;
		} 
	

}
	}