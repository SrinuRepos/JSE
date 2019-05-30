class Student
	{
private int studentNo;
private String studentName;

public Student(int no , String name)
	{
	studentNo = no;
	studentName = name;
	} //Parameterized Constructor

public void display()
	{
	System.out.println(" No : "+studentNo);
	System.out.println(" Name "+studentName);
	}

	}

public class ParameterizedConstructorEx
	{
public static void main(String args[])
{
	  Student s1 = new Student(1242,"Srinu");
	System.out.println(" \n\n Student 1 Info :");
		s1.display();

	 Student s2 = new Student(1243,"Naresh");
	System.out.println(" \n\n Student 2 Info :");
		s2.display();
}
	}











