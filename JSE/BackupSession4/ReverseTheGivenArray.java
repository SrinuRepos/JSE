public class ReverseTheGivenArray
	{
public static void main(String args[])
{
	int[] count = {2,4,6,8,10};
	
	int n = count.length -1 ; 
	int i = 0;

	System.out.println(" count[] before reverse ");
		while( i <= n)
		{
		System.out.println(count[i]);
		i++;
		}

	
	int[] revCount = new int[count.length];
	 i = n;
		
	while( i >= 0)
		{
		 revCount[n-i] = count[i];  
		i--;
		}
	count = revCount;
	
	i = 0;

	System.out.println(" count[] After reverse ");
		while( i <= n)
		{
		System.out.println(count[i]);
		i++;
		}

}
	}










