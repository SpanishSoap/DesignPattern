package cn.ohbee.factory.pizza.pizzano;

/**
 * 芝士披萨
 * @author zf
 */
public class CheesePizza extends Pizza{
    public  CheesePizza(){
        super.name= "Cheese Pizza";
        super.dough= "Regular Crust";
        super.sauce= "Marinara Pizza Sauce";
        super.toppings.add("Fresh Mozzarella");
        super.toppings.add("Parmesan");
    }
}
