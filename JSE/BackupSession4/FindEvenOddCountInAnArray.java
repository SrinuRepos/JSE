public class FindEvenOddCountInAnArray
	{
public static void main(String args[])
{
	int[] count = {1,4,5,7,10,9,11,16,19};
	
	int i = 0;
	int n = count.length; 
	int evenCount = 0;
	int oddCount = 0;

	System.out.println(" Before Update The array is :");
	while( i < n)
		{
		    if( count[i] % 2 == 0)
			{
			evenCount++;
			}	
			else
			{
			oddCount++;
			}
		i++;
		}

		System.out.println(" Length of Array "+n);
		System.out.println(" Even Count ="+evenCount);
		System.out.println(" Odd Count  ="+oddCount);

}
	}










