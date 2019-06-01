class  AccountHolder
	{
private int accNo;
private String accName;

public AccountHolder()
	{
System.out.println(" this = "+this);
System.out.println(" From AccountHolder :: Constructor Used for Initilization");
	}
public void setAccNo(int accNo)
{
	this.accNo = accNo;
}

public void setAccName(String accName)
{
	this.accName = accName;
}

public int getAccNo()
	{
return accNo;
	}
public String getAccName()
	{
return accName;
	}
	}

public class ThisEx1
	{
public static void main(String args[])
{
	AccountHolder acc = new AccountHolder();
	System.out.println(" acc = "+acc);
	acc.setAccNo(1242);
	acc.setAccName("Srinu");
	System.out.println(" ACCNo = "+acc.getAccNo());
	System.out.println(" ACCName = "+acc.getAccName());
}
	}









