package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompMain {
	public static void main(String args[]) {
		List<Employee> empList = new ArrayList<>();
		Employee emp = new Employee(10,  "Chiru", 31, 199009.998);
		empList.add(emp);
		emp = new Employee(20,  "Tapal", 28, 189009.998);
		empList.add(emp);
		emp = new Employee(25,  "Divya", 17, 433567.8);
		empList.add(emp);
		emp = new Employee(20,  "Eshan", 2, 999.99);
		empList.add(emp);
		
		Collections.sort(empList);
		
		for(Employee e : empList){
			System.out.println(e.getName()+", "+e.getEmpNum() + ", "+e.getAge()+", "+e.getSalary());
		}
	}
}
