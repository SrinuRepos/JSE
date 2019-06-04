class Person
	{
private final String panCardNo  ;

public Person(String panCardNo)
{
	this.panCardNo = panCardNo ; // Blanck Final Variable
}

public String getPanCardNo()
{
	return panCardNo;
}

	}

public class FinalVarEx2
	{
public static void main(String args[])
{
	Person srikanth = new Person("12R42");

	Person naresh = new Person("12R53");

	System.out.println(" Srikanth PAN NO :: "+srikanth.getPanCardNo());
	System.out.println(" Naresh PAN NO :: "+naresh.getPanCardNo());

	
}
	}






