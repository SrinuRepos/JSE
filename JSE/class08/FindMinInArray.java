public class FindMinInArray
	{
public static void main(String[] args)
{
	int[] count = {10,120,30,-40};
	int min = Integer.MAX_VALUE;
	int i  = 0 ;
	while( i < count.length)
		{
	if( min > count[i])
	{
	  min = count[i];
	}
	i++;
		}

	System.out.println(" Min Value "+min);
	
}
	}