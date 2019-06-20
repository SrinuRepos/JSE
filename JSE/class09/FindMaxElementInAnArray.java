public class FindMaxElementInAnArray
	{
public static void main(String args[])
{
	int[] a = {10,2,3,-40,100,-1,30,750};
	int i = 0;
	int max = Integer.MIN_VALUE;
	while( i < a.length)
		{
		if( max < a[i])
			{
			max = a[i];
			}
		i++;
		}
System.out.println(" Max Value is : "+max);

System.out.println(" MIN_VALUE of Integer"+Integer.MIN_VALUE);
System.out.println(" MAX_VALUE of Integer"+Integer.MAX_VALUE);
	
}
	}