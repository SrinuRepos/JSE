public class Polydrum
	{
public static void main(String args[])
{
	int n = 5005;
	int temp = n;
	int rev = 0;
		while(n > 0)
		{
		int r = n % 10;
		rev = rev * 10 + r;
		n = n/10;
		}
	
	if( rev == temp)
		{
		System.out.println(" Given Number is Polydrum");
		}
	else
		{
		System.out.println(" Given Number is not a Polydrum");
		}

}
	}