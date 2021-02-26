package cn.ohbee.factory.pizza.pizzaaf;

import cn.ohbee.factory.pizza.pizzaaf.pizza.Pizza;

/**
 * 抽象披萨店
 * @author zf
 */
public abstract class PizzaStore {

    /**
     * 将制作披萨的具体操作下放给子类
     * @param item
     * @return
     */
    public abstract Pizza createPizza(String item);

    /**
     * 为了确保，披萨店子类中，生产披萨，配送披萨的流程一致，可以将此方法定义为 final
     * @param type
     * @return
     */
    public final  Pizza orderPizza(String type){
        Pizza pizza= createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
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
