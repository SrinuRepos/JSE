interface Menu
	{
public abstract void prepareItem();
public abstract void hotelInfo();
	}

abstract class MenuAbs implements Menu
	{
public void hotelInfo()
{
	System.out.println(" Welcome to TAJ BANJARA !!!!\n");
}
	}

class IndianCookie extends MenuAbs
	{
public void prepareItem()
{
	System.out.println(" Item is prepared by Indian Cookie");
}
	}

class AmaricanCookie extends MenuAbs
	{
public void prepareItem()
{
	System.out.println(" Item is prepared by Amarican Cookie ");
}
	}

class ChineesCookie extends MenuAbs
	{
public void prepareItem()
{
	System.out.println(" Item is prepared by Chinees Cookie");
}
	}

class Customer
	{
public void orderItem(Menu m)
{
m.prepareItem();
}
	}


public class HotelApp
	{
public static void main(String args[]) throws Exception
{
	if(args.length == 1)
	{
	  Class c = Class.forName(args[0]);
	  Menu m = (Menu) c.newInstance();
	  m.hotelInfo();
	  Customer cus = new Customer();
	   cus.orderItem(m);
	}else
	{
	System.out.println(" Please Pass Cookie as argument");
	}
}
	}






