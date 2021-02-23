package cn.ohbee.factory.pizza.pizzano;

/**
 * 披萨店
 * @author zf
 */
public class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza= null;
        if("Cheese".equals(type)){
            pizza = new CheesePizza();
        }else if("Clam".equals(type)){
            pizza = new ClamPizza();
        }else if("Pepperoni".equals(type)){
            pizza = new PepperoniPizza();
        }else if("Veggie".equals(type)){
            pizza= new VeggiePizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
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
