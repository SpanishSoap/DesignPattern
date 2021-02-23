package cn.ohbee.factory.pizza.pizzasi;


/**
 * 海鲜味的披萨
 * @author zf
 */
public class ClamPizza extends Pizza {
    public ClamPizza() {
        super.name = "Clam Pizza";
        super.dough = "Thin crust";
        super.sauce = "White garlic sauce";
        super.toppings.add("Clams");
        super.toppings.add("Grated parmesan cheese");
    }
}
