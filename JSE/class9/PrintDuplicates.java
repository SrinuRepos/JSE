public class PrintDuplicates
	{
public static void main(String args[])
{
	int[] a = {10,20,10,20,30,40};
	int i = 0;
	boolean flag = false;

		while(i < a.length)
			{
			int j = i+1;
			   while( j < a.length )
				{
				  if( a[i] == a[j])
					{
					
					System.out.println(a[j]);
					break;
					}
				j++;
				}
			
			  i++;
			}
	
		
}
	}