package behavioral.decorator.toppings;

import behavioral.decorator.BasePizza;

public class MushroomTopping extends ToppingDecorator{
	
	BasePizza pizza;

	public MushroomTopping(BasePizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public int cost() {
		return this.pizza.cost()+60;
	}

}
