public class FindSumOfArray
	{
public static void main(String[] args)
{
	int[] count = {10,110,10,-40};
	int sum = 0;
	int i  = 0 ;
	while( i < count.length)
		{
	  sum = sum + count[i];
	i++;
		}

	System.out.println(" Sum is "+sum);
	
}
	}