package designPatterns.decorator.coffee;

public class SouthIndianCoffee extends Coffee {

	public SouthIndianCoffee() {
		description = "South Indian coffee";
	}

	@Override
	public double cost() {
		return 3.4;
	}

}
