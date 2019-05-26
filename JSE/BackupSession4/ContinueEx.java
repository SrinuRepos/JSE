public class ContinueEx
	{
public static void main(String args[])
{
	int i = 1;
	while( i <= 10)
		{
	 if( i % 2 == 1)
		{
		i++;
		continue;
		}
	
	System.out.println(i);
	i++;
		}
}
	}