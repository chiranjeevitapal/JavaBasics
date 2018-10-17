
enum MyEnumer {
	ADIDAS("ADS"), PUMA("PMA"), REEBOK("RBK"), REDTAPE("RTP");
	private String brand;
	MyEnumer(String brand) {
		this.brand = brand;
	}
	
	public String getEnumer() {
		return brand;
	}
}

public class MyEnum {
	public static void main(String arg[]) {
		MyEnumer[] myEnumer = MyEnumer.values();
		for(MyEnumer list: myEnumer) {
			System.out.println(list.getEnumer());
		}
	}
}

