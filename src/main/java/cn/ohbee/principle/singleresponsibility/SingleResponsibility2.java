package cn.ohbee.principle.singleresponsibility;

/**
 * @author zf
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("帆船");
    }

}


/**
 * 1. 遵守单一职责原则
 * 2. 问题: 对于这种简单的需求，将类分解，改动过大
 * 3. 解决方式：在方法的颗粒度上进行分解
 */

class RoadVehicle {

    public  void run( String vehicle ){
        System.out.println(vehicle + " 在公路上行驶！");
    }

}

class AirVehicle {

    public  void run( String vehicle ){
        System.out.println(vehicle + " 在天空中行驶！");
    }

}

class WaterVehicle {

    public  void run( String vehicle ){
        System.out.println(vehicle + " 在水中行驶！");
    }

}
