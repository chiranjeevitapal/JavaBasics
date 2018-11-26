package designPatterns.decorator.coffee;

import designPatterns.decorator.coffee.condiments.Chocolate;
import designPatterns.decorator.coffee.condiments.CoffeeCondiments;
import designPatterns.decorator.coffee.condiments.Cream;
import designPatterns.decorator.coffee.condiments.DoubleSugar;

public class CoffeeMaker {
	public static void main(String args[]) {
		Coffee coffee = new DarkCoffee();
		CoffeeCondiments customCoffee = new Chocolate(coffee);
		customCoffee = new Cream(customCoffee);
		customCoffee = new DoubleSugar(customCoffee);
		System.out.println(customCoffee.getDescription() + " : $" + customCoffee.cost());
	}
}
