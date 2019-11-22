
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamingAPIFilter {

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
		
		List<String> empNames = list.stream().
								filter(emp -> emp.getEmployeeSalary() > 60000f).
								map(emp -> emp.getEmployeeName()).collect(Collectors.toList());
		empNames.forEach(name -> System.out.println(name));
	}

}
