public class Find3ndMaxElementInAnArray
	{
public static void main(String args[])
{
	int[] a = {10,20,-1,20,50,12,50};
	int i = 0;
	int max1 = Integer.MIN_VALUE;
	int max2 = Integer.MIN_VALUE;
	int max3 = Integer.MIN_VALUE;
	while( i < a.length)
		{
		if(max1 <= a[i])
			{
			if( max1 != a[i])
				{
				max3 = max2;
				max2 = max1;
				max1 = a[i];
				}
			}
		else if(max2 <= a[i])
			{
			    if( max2 != a[i])
				{
				   max3 = max2;
				   max2 = a[i];
				}
			 
			}
		else if( max3 <= a[i])
			{
				max3 = a[i];
			}	

		i++;
		}
	System.out.println(" MAX1 = "+max1);
	System.out.println(" MAX2 = "+max2);
	System.out.println(" MAX3 = "+max3);
}
	}