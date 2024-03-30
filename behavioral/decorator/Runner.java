package behavioral.decorator;

import behavioral.decorator.pizzatypes.VeggiePizza;
import behavioral.decorator.toppings.ExtraCheeseTopping;
import behavioral.decorator.toppings.MushroomTopping;

public class Runner {

	public static void main(String[] args) {
		
				BasePizza myPizza=new ExtraCheeseTopping(new VeggiePizza());
				BasePizza yourPizza=new ExtraCheeseTopping(new MushroomTopping(
						new VeggiePizza()));
				System.out.println(myPizza.cost()+"\n"+yourPizza.cost());
	}

}
