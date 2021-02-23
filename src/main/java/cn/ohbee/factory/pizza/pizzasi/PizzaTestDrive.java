package cn.ohbee.factory.pizza.pizzasi;


/**
 * 测试订购披萨
 * @author zf
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

        Pizza cheesePizza = pizzaStore.orderPizza("Cheese");
        System.out.println("We got a " + cheesePizza.getName() + "\n");

        Pizza pepperoniPizza = pizzaStore.orderPizza("Pepperoni");
        System.out.println("We got a " + pepperoniPizza.getName() + "\n");
    }
}
/**
 *
 * 总结
 *  ① 简单工厂实际不是一个设计模式，更像一种编程习惯。由于使用频繁，所以习惯的称之为 “简单工厂模式”。
 *  ② 若不同区域都有 PizzaStore ， 例如 NewYorkPizzaStore、LondonPizzaStore 等等，都可以同一调用 SimplePizzaFactory 中的 createPizza 来获取披萨。而不是像上述范例中,修改所有相关 Store。
 *  ③ 可以将简单工厂类定义为一个静态方法，如此就可以不需要实例化对象来使用了。但是这个方式也有缺点，就是无法通过继承来改变创建方法的行为。
 */