package cn.ohbee.principle.singleresponsibility;

/**
 * @author zf
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("帆船");
        vehicle.run("飞机");
    }
}

/**
 * 1. 问题: 交通类中的方法 违反了单一职责原则
 * 2. 解决方式: 根据不同的交通工具运行方法不同，分解为不同的类来执行
 */
class Vehicle {

    public  void run( String vehicle ){
        System.out.println(vehicle + " 在公路上行驶！");
    }

}
