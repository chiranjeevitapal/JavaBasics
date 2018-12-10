package designPatterns.decorator.coffee;

public class LatteCoffee extends Coffee {

	public LatteCoffee() {
		description = "Latte coffee";
	}

	@Override
	public double cost() {
		return 5.0;
	}

}
