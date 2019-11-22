
import java.util.ArrayList;
import java.util.List;

public class ReduceStreamApi {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(555, "Naresh", 67500f);
		Employee emp2 = new Employee(666, "Arup", 500f);
		Employee emp3 = new Employee(111, "Sateesh", 57500f);
		Employee emp4 = new Employee(888, "Venkatesh", 60500f);
		Employee emp5 = new Employee(222, "Srikath", 167500f);
			
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		Float totalSalary = list.stream().
								map(emp -> emp.getEmployeeSalary())
								.reduce(0.0f, (sum , sal ) -> (sum+sal));
		System.out.println("totalSal :: "+totalSalary);
	}

}
