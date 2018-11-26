package designPatterns.decorator.coffee;

public class DarkCoffee extends Coffee {

	public DarkCoffee() {
		description = "Dark coffee";
	}

	@Override
	public double cost() {
		return 4.5;
	}

}
