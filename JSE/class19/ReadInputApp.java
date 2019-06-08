import java.util.Scanner;

public class ReadInputApp
	{
public static void main(String args[])
{
   Scanner scan = new Scanner(System.in);
   System.out.println(" Please Enter Name :");
	String name = scan.next();

   System.out.println(" Please Enter No");
	int no = scan.nextInt();

  System.out.println(" Please Enter Sal");
	float sal = scan.nextFloat();


System.out.println(" Entered Values:");
System.out.println(" Name :"+name);
System.out.println(" No   :"+no);
System.out.println(" Sal  :"+sal);

}
	}








