package preinterview;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BullShit {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();	
		Employee emp = new Employee(12345, "Chiranjeevi", 139098.5);
		empList.add(emp);
		
		emp = new Employee(4656666, "Sasi", 45452.5);
		empList.add(emp);
		
		emp = new Employee(784323, "Divya", 97876.5);
		empList.add(emp);
		
		Collections.sort(empList);
		//Collections.reverse(empList);
		
		empList.forEach(result -> {
			System.out.println(result.getEmpId()+" "+result.getEmpName() + " "+result.getSalary());
		});
	}
	
	

}


class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private double salary;
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee emp) {
		if(this.empId<emp.getEmpId()) {
			return -1;
		}else if(this.empId>emp.getEmpId()) {
			return 1;
		}else {
			return 0;
		}
	}
}