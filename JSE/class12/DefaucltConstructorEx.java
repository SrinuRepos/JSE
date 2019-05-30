class Employee
	{
private int empNo;
private String empName;
private float  salary;

public Employee()
	{
	empNo = 1242;
	empName = "Srinu";
	salary = 5000f;
	}

public void display()
	{
	System.out.println(" EmpNo "+empNo);
	System.out.println(" EmpName "+empName);
	System.out.println(" EmpSal "+salary);
	}

	}

public class DefaucltConstructorEx
	{
public static void main(String args[])
{
	Employee emp = new Employee();
	emp.display();
}
	}











