package cn.ohbee.factory.pizza.pizzasi;

/**
 * 简单披萨工厂类
 * @author zf
 */
public class SimplePizzaFactory {


    public Pizza createPizza(String type){
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
        return pizza;
    }

}
