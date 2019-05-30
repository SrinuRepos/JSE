class Employee
	{
private int empNo ;
private String empName;
private float  salary;

public void setEmpNo(int no)
{
	empNo = no;
}

public void setEmpName(String name)
{
	empName = name;
}

public void setSalary(float sal)
{	
	salary = sal;
}

public int getEmpNo()
	{
return empNo;
	}

public String getEmpName()
	{
	return empName;
	}

public float getSalary()
{
	return salary;
}
	}

public class EncapsulationEx
	{
public static void main(String args[])
{
	Employee emp = new Employee();
	emp.setEmpNo(1242);
	emp.setEmpName("Srinu");
	emp.setSalary(5000f);

	System.out.println(" EmpNo "+emp.getEmpNo());
	System.out.println(" EmpName "+emp.getEmpName());
	System.out.println(" EmpSalary "+emp.getSalary());
}
	}











