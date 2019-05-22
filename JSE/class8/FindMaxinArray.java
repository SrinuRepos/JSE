public class FindMaxinArray
	{
public static void main(String[] args)
{
	int[] count = {10,120,30,-40};
	int max = Integer.MIN_VALUE;
	int i  = 0 ;
	while( i < count.length)
		{
	if( max < count[i])
	{
	  max = count[i];
	}
	i++;
		}

	System.out.println(" MAX Value "+max);
	
}
	}