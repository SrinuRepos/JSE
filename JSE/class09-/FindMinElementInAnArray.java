public class FindMinElementInAnArray
	{
public static void main(String args[])
{
	int[] a = {10,2,3,-40,100,-1,30,750};
	int i = 0;
	int min = Integer.MAX_VALUE;
	while( i < a.length)
		{
		if( min > a[i])
			{
			min = a[i];
			}
		i++;
		}
System.out.println(" Min Value is : "+min);

	
}
	}