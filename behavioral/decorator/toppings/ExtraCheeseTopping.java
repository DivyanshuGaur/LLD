package behavioral.decorator.toppings;

import behavioral.decorator.BasePizza;

public class ExtraCheeseTopping extends ToppingDecorator{

	BasePizza pizza;
	
	
	
	public ExtraCheeseTopping(BasePizza pizza) {
		this.pizza = pizza;
	}



	@Override
	public int cost() {
		return pizza.cost()+75;
	}

}
