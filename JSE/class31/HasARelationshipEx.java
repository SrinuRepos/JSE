class Shoe
	{
private int id ;
private String name;

public Shoe()
{
}

public Shoe(int id , String name)
{
	this.id = id;
	this.name = name;
}

public void setId(int id)
{
	this.id = id;
}

public void  setName(String name)
{
	this.name = name;
}

public  int  getId()
{
	return id;
}


public String getName()
{
	return name;
}

	}

class User
	{
private String userName;
private Shoe  shoe ; // HAS- A Realationship

public User()
{
}

public User(String userName,Shoe  shoe)
	{
this.userName = userName;
this.shoe = shoe;
	}

//setters and getters

public void setUserName(String userName)
	{
this.userName = userName;
	}

public void setShoe(Shoe shoe)
	{
this.shoe = shoe;
	}

public String getUserName()
{
	return userName;
}

public Shoe getShoe()
{
	return shoe;
}

public void display()
{
System.out.println(" \n\n NAME :: "+userName);
System.out.println(" Shoe ID ::"+shoe.getId());
System.out.println(" Shoe Name ::"+shoe.getName());
}

	}

public class HasARelationshipEx
	{
public static void main(String args[])
{
	Shoe shoe1 = new Shoe(111,"PUMA");
	User user1 = new User("Srikanth",shoe1);

	Shoe shoe2 = new Shoe(222,"FILA");
	User user2 = new User("Naresh",shoe2);

		user1.display();
		user2.display();
}
	}






