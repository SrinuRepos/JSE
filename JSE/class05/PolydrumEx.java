public class PolydrumEx
	{
public static void main(String args[])
{
	int n = 1001;
	int temp = n;
	int rev = 0;

	while( n > 0)
		{
		int r = n % 10;
		rev = rev * 10 + r;
		n = n / 10;
		}
	if(rev == temp)
		{
		System.out.println(" Given number is Polydrum : rev = "+rev);
		}
	else
		{
		System.out.println(" Given number is not a Polydrum : rev = "+rev);
		}
}
	}