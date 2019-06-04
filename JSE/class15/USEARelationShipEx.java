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


public void getStockInfo(Item i)  // USE-A Relationship
{
	System.out.println(" Available Stock is :");
	i.getItemDetails();
}

	}


public class USEARelationShipEx
	{
public static void main(String args[])
{
	Store s = new Store();
	Item obj = new Item();
	s.getStockInfo(obj);
		
}
	}



