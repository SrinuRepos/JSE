public class UpdateEvenNumToOddViceVersaEx
	{
public static void main(String args[])
{
	int[] count = {1,4,5,7,10,9,11,16,19};
	
	int i = 0;
	int n = count.length; 
	System.out.println(" Before Update The array is :");
	while( i < n)
		{
		System.out.println(count[i]);
		i++;
		}


	// Updation logic for even to odd and odd to even
		i = 0;
		while( i < n)
		{
		count[i] = count[i] + 1;
		i++;
		}

	System.out.println(" After Update The array is :");
		 i = 0;
	while( i < n)
		{
		System.out.println(count[i]);
		i++;
		}

}
	}










