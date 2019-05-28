class Sample
	{
int count;
String name;
boolean flag;
float balance;
char ch; // Instace Variables

public void display()
{
int  a = 10; // Local Variables
System.out.println(" int count    = "+count);
System.out.println(" String name  = "+name);
System.out.println(" boolean flag = "+flag);
System.out.println(" float balance= "+balance);
System.out.println(" char ch      = "+ch);
System.out.println(" Local varaible a = "+a);
}

public void print()
{
System.out.println("From print() ::Sample float balance= "+balance);

}
	}

public class InstanceAndLocalVariablesEx
	{
public static void main(String args[])
{
	Sample s = new Sample();
	s.display();
	s.print();
}
	}