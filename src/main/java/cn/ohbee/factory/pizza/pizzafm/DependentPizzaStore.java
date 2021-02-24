package cn.ohbee.factory.pizza.pizzafm;

public class DependentPizzaStore {

	/**
	 * ① 若不使用工厂模式，要完成 PizzaTestDrive 中的需求，我们需要在 createPizza 方法中对所有类型的披萨
	 * 有者严重的依赖。
	 * ② 当新拓展一个地域的店面，需要修改这里的代码，违反了对拓展开放，对修改关闭的基本原则。
	 * @param style
	 * @param type
	 * @return
	 */
	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if (style.equals("NY")) {
			if (type.equals("cheese")) {
				pizza = new NYStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new NYStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new NYStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new NYStylePepperoniPizza();
			}
		} else if (style.equals("Chicago")) {
			if (type.equals("cheese")) {
				pizza = new ChicagoStyleCheesePizza();
			} else if (type.equals("veggie")) {
				pizza = new ChicagoStyleVeggiePizza();
			} else if (type.equals("clam")) {
				pizza = new ChicagoStyleClamPizza();
			} else if (type.equals("pepperoni")) {
				pizza = new ChicagoStylePepperoniPizza();
			}
		} else {
			System.out.println("Error: invalid type of pizza");
			return null;
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
