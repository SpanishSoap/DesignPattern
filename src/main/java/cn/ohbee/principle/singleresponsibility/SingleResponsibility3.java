package cn.ohbee.principle.singleresponsibility;

/**
 * @author zf
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle3 vehicle = new Vehicle3();
        vehicle.roadRun("汽车");
        vehicle.airRun("飞机");
        vehicle.waterRun("帆船");
    }

}


/**
 * 这个类虽然没有在类的级别上遵守单一职责原则；但是在方法的级别上，依旧可以认为遵守了单一职责原则
 */

class Vehicle3 {

    public  void roadRun( String vehicle ){
        System.out.println(vehicle + " 在公路上行驶！");
    }

    public  void airRun( String vehicle ){
        System.out.println(vehicle + " 在天空中行驶！");
    }

    public  void waterRun( String vehicle ){
        System.out.println(vehicle + " 在水中行驶！");
    }
}


