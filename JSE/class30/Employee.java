public class Employee
	{
private int empNo ;
private String empName;
private float empSal;

public Employee()
{
}

public Employee(int empNo,String empName,float empSal)
{
this.empNo = empNo;
this.empName = empName;
this.empSal = empSal;
}

public void setEmpNo(int empNo)
{
	this.empNo = empNo;
}

public void setEmpName(String empName)
{
this.empName = empName;
}

public void setEmpSal(float empSal)
{
this.empSal = empSal;
}

public int getEmpNo()
{
return empNo;
}

public String getEmpName()
{
return empName;
}
public float getEmpSal()
{
 return empSal;
}

public void print()
{
System.out.println(this.empNo);
System.out.println(this.empName);
System.out.println(this.empSal);
}

public void print(int empNo)
	{
System.out.println(empNo);
	}

public void print(String empName)
	{
System.out.println(empName);
	}

public void print(float empSal)
	{
System.out.println(empSal);
	}



	}