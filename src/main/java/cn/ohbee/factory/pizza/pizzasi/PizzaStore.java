package cn.ohbee.factory.pizza.pizzasi;


/**
 * 披萨店
 * @author zf
 */
public class PizzaStore {

    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = simplePizzaFactory.createPizza(type);
        pack(pizza.getName());
        delivery(pizza.getName());
        return  pizza;
    }


    public void pack(String name){
        System.out.println(name + " is being packed");
    }

    public void delivery(String name){
        System.out.println(name + " is being delivered");
    }

}
