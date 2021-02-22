package cn.ohbee.singleton.singleton2;


public class Singleton2 {

    public static void main(String[] args){
                Singleton instance =  Singleton.getInstance();
                Singleton instance1 =  Singleton.getInstance();
                boolean instanceIsEq = instance == instance1;
                boolean hashCodeIsEq =  Integer.valueOf(instance.hashCode()).equals(instance1.hashCode());
                System.out.println("实例是否相等:"+instanceIsEq+"; hashCode是否相等:"+hashCodeIsEq);
    }

}


/**
 *  饿汉式 静态代码块(此方式线程安全)
 */

/**
 * final 对象构建时候，final 修饰的域就会被赋值；且对象构建成功之后，被修饰的变量将不能再次被修改
 *
 * static 静态代码块，在类初始化的时候为 instance 赋值
 */
class Singleton{


    private Singleton() {}


    private final  static Singleton instance ;

    static {
        instance = new Singleton();
    }
    

    public static Singleton getInstance(){
        return  instance;
    }

}
