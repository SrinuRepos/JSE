class Employee
	{
private int id ;
private String name;

public Employee()
{
}

public Employee(int id , String name)
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

public void display() 
{
}
	}

class RegularEmployee extends Employee
	{
private float salary;
private float bonus;

public RegularEmployee()
{
}

public RegularEmployee(int id , String name , float salary, float bonus)
{
	//setId(id);
	//setName(name);

	super(id,name);
	this.salary = salary;
	this.bonus = bonus;
}

public void setSalary(float salary)	
{
	this.salary = salary;
}

public void setBonus(float bonus)
{
	this.bonus = bonus;
}

public float getSalary()
{
	return salary;
}

public float getBonus()
	{
return bonus;
	}


public void display()
{
	System.out.println( " Regular Employee Info :");
	System.out.println( " ID : "+getId());
	System.out.println( " Name : "+getName());
	System.out.println("  Salary "+salary);
	System.out.println("  Bonus "+bonus);
}
	}


class ContractEmployee extends Employee
	{
private String contractPeriod ;
private float payPerHour;

public ContractEmployee()
{
}

public ContractEmployee(int id , String name , String contractPeriod , float payPerHour)
{
	super(id,name);
	this.contractPeriod = contractPeriod;
	this.payPerHour = payPerHour;
}

// setters and getters

public void display()
{
	System.out.println( " Contact Employee Info :");
	System.out.println( " ID : "+getId());
	System.out.println( " Name : "+getName());
	System.out.println("  ContractPeriod "+contractPeriod);
	System.out.println("  PayPerHour "+payPerHour);
}


	}


public class EmpIsARelationshipApp
	{
public static void main(String args[])
{
	Employee regEmp = new RegularEmployee(1242,"Srinu",1500f,25f);
	regEmp.display();

	Employee conEmp = new ContractEmployee(1254,"Kiran","2Years",150f);
	conEmp.display();
}
	}
























