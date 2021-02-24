package cn.ohbee.factory.pizza.pizzafm;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		name = "Chicago Deep Dish Veggie Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
		toppings.add("Black Olives");
		toppings.add("Spinach");
		toppings.add("Eggplant");
	}

	/**
	 * 修改了披萨的切片方式
	 */
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
