/*
An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
*/

public class ArmstrongNumberEx
	{
public static void main(String args[])
{
	int n = 371;
	int sum = 0;
	int temp = n;
		while(n > 0)
			{
			int r =  n % 10;
			sum = sum + r*r*r;
			n = n/10;
			}
		if(sum == temp)
			{
		System.out.println(" Given Number is Armstrong");
			}
		else
			{
		System.out.println(" Given Number is Not a Armstrong");
			}
	
}
	}







