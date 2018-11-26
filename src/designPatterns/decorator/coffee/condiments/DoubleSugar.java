package designPatterns.decorator.coffee.condiments;

import designPatterns.decorator.coffee.Coffee;

public class DoubleSugar extends CoffeeCondiments {
	private Coffee coffee;

	public DoubleSugar(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		return coffee.getDescription() + ", double sugar";
	}

	@Override
	public double cost() {
		return coffee.cost() + 0.26;
	}

}
