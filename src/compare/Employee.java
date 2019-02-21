package compare;

public class Employee implements Comparable<Employee> {
	private int empNum;
	private String name;
	private int age;
	private double salary;
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.getName());
	}
	public Employee(int empNum, String name, int age, double salary) {
		super();
		this.empNum = empNum;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	
	
	
	
}
