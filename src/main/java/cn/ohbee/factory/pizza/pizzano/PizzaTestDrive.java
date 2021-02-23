package cn.ohbee.factory.pizza.pizzano;

/**
 * 测试订购披萨
 * @author zf
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();

        Pizza cheesePizza = pizzaStore.orderPizza("Cheese");
        System.out.println("We got a " + cheesePizza.getName() + "\n");

        Pizza pepperoniPizza = pizzaStore.orderPizza("Pepperoni");
        System.out.println("We got a " + pepperoniPizza.getName() + "\n");
    }
}
/**
 *
 * 问题总结
 *  ① 在 PizzaStore 类中 通过传入不同的名称的信息，返回不同类型的披萨，当我们添加或者删除一个类型的披萨，则需要修改 PizzaStore 中的判断代码
 *  ② 若不同区域都有 PizzaStore ， 多个不同类型的 PizzaStore ， 例如 NewYorkPizzaStore、LondonPizzaStore 等等，则都需要修改判断代码来添加或者删除披萨类型
 *  ③ 上述做法违反了，对修改关闭，对拓展开放的基本原则，所以我们使用简单工厂类解决这个问题
 */