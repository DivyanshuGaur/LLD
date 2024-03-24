package behavioral.decorator.pizzatypes;

import behavioral.decorator.BasePizza;

public class VeggiePizza extends BasePizza{

	@Override
	public int cost() {
		return 120;
	}

}
