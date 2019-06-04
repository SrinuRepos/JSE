class Student
	{
private String name ;
private static final  String clgName = "SBIT";

public Student(String name  )
{
	this.name = name;
	 
}

public void getInfo()
{
	System.out.println(" \n\n Name :: "+name);
	System.out.println(" ClgName :: "+clgName);
}
	}

public class  StaticVariableEx2
	{
public static void main(String args[])
{
	Student s1 = new Student("Srinu" );
	Student s2 = new Student("Venkat" );

	s1.getInfo();
	s2.getInfo();
}
	}






