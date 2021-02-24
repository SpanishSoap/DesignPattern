package cn.ohbee.factory.pizza.pizzafm;


/**
 * 测试订购披萨
 * @author zf
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        System.out.println("=====================================");

        PizzaStore chicagoStore = new ChicagoPizzaStore();

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
/**
 *
 * 范例详情
 *  ① 针对不同的区域的披萨店，同一类型的披萨配料不同、制作方式不同，也可以有不同的披萨类型
 *  ② 但是披萨店的总部，需要控制每个店面的制作，订购披萨流程
 * 解决方式
 *  ① 增加一个抽象披萨店面，用于控制披萨的制作流程，实现订构披萨的流程
 *  ② 创建披萨的流程下放到抽象披萨店面的所有子类中，这样子类就可以添加减少披萨类型，使用不同配料等自定义操作了
 * 使用模式
 *  ① 使用工厂方法模式
 * 工厂方法模式
 *  ① 所有的工厂模式都是用来封装对象的创建。工厂方法模式通过让子类决定该创建的对象是什么，来达到将对象创建的过程封装的目的。
 *  ② 定义：工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
 *  ③ 将创建产品和对产品的操作做了解耦，利于修改和拓展。
 */