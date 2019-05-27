public class VerifyArrayContainsDuplicatesORNot
	{
public static void main(String args[])
{
	int[] a = {10,20,30,40};
	int i = 0;
	boolean flag = false;

		while(i < a.length)
			{
			int j = 0;
			   while( j < a.length )
				{
				  if( i != j && a[i] == a[j])
					{
					
					flag = true;
					break;
					}
				j++;
				}
			if( flag == true)
			{
				break;
			}
			  i++;
			}
	
		if(flag == true)
			{
			System.out.println(" Array Contains Duplicates");
			}
			else
			{
		System.out.println(" Array Does not Contains Duplicates");
			}
}
	}