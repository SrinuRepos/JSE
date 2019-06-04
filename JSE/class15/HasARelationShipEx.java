class Item
	{
private String name = "Santoor";
private int price = 35;

public void getItemDetails()
{
	System.out.println(" Name  : "+name);
	System.out.println(" Price : "+price);
}
	}

class Store
	{
private Item i = new Item(); // HAS-A Relationship

public void getStockInfo()
{
	System.out.println(" Available Stock is :");
	i.getItemDetails();
}
	}


public class HasARelationShipEx
	{
public static void main(String args[])
{
	Store s = new Store();
	s.getStockInfo();	
}
	}



