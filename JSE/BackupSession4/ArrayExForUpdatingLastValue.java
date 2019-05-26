public class ArrayExForUpdatingLastValue
	{
public static void main(String args[])
{
	int[] count = { 21,22,23};
	
	int i = 0;
	int n = count.length; 
	count[ n-1 ] = 45;
	while( i < n)
		{
		System.out.println(" Index " + i + " Value  = "+count[i]);
		i++;
		}

}
	}