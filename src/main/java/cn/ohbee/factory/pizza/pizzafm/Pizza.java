package cn.ohbee.factory.pizza.pizzafm;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义披萨的抽象类
 * 其中有披萨的基本属性 名称，面团，调味酱
 * 还有制作披萨的全流程 准备，烘烤，切割，打包
 * @author zf
 */
abstract public class Pizza {
    String name;
    String dough;
    String sauce;
    List toppings =new ArrayList();

    public String getName() {
        return name;
    }

    public void prepare(){
        System.out.println("preparing "+ name);
    }

    public void bake(){
        System.out.println("baking "+ name);
    }

    public void cut(){
        System.out.println("cutting "+ name);
    }

    public void box() {
        System.out.println("boxing "+ name);
    }
}
