/*
An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
*/

public class ArmstrongNumberForEx
	{
public static void main(String args[])
{
	int n = 371;
	int sum = 0;
	int temp = n;
		for(;n > 0;n = n/10)
			{
			int r =  n % 10;
			sum = sum + r*r*r;
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







