package designPatterns.decorator.coffee.condiments;

import designPatterns.decorator.coffee.Coffee;

public class Cream extends CoffeeCondiments {
	private Coffee coffee;

	public Cream(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		return coffee.getDescription() + ", cream";
	}

	@Override
	public double cost() {
		return coffee.cost() + 2.99;
	}
}
