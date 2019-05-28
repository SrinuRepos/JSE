public class ForLoopReverseNumEx
	{
public static void main(String args[])
{
	int  n = 123 ;
	int rev = 0;

	for(; n > 0 ; n = n/10)
		{
	 int r = n %10;
	rev = rev * 10 + r;
	
		}
	System.out.println(" Rev of a num "+rev);

}
	}