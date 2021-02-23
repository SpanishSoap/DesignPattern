package cn.ohbee.factory.pizza.pizzano;

/**
 * 意大利辣肠披萨
 * @author zf
 */
public class PepperoniPizza extends Pizza{
    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }
}
