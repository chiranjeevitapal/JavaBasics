package cloneable;


public class CloneModal implements Cloneable{
	private String name;
	private int age;
	private double height;
	private double weight;
	
	private Company company;
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String mymethod(){
		return "Fuck off";
	}
	
	
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
}
