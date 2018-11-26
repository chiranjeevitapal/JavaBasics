package designPatterns.decorator.coffee.condiments;

import designPatterns.decorator.coffee.Coffee;

public class Chocolate extends CoffeeCondiments {
	private Coffee coffee;

	public Chocolate(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		return coffee.getDescription() + ", chocolate";
	}

	@Override
	public double cost() {
		return coffee.cost() + 1.66;
	}

}
