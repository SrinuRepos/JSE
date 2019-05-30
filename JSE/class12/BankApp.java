class AccountHolder
	{
private float balance = 5000.50f;
private int accNo = 1242;

public void withdraw(int pin , float amount)
	{
		if( pin == 1234)
		{
		balance = balance - amount;
		System.out.println(" Withdraw Successfull");
		System.out.println(" Current Balance :: "+balance);
		}
		else
			{
		System.out.println(" Sorry !!! Invalid Pin");
			}
	}

	}

public class BankApp
	{
public static void main(String args[])
{
	AccountHolder acc = new AccountHolder();
	acc.withdraw(12345,2000f);


}

	}