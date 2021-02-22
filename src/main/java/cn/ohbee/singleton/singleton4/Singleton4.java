package cn.ohbee.singleton.singleton4;

public class Singleton4 {

    public static void main(String[] args) {
        Singleton instance =   Singleton.getInstance();
        Singleton instance1 =  Singleton.getInstance();
        boolean instanceIsEq = instance == instance1;
        boolean hashCodeIsEq =  Integer.valueOf(instance.hashCode()).equals(instance1.hashCode());
        System.out.println("实例是否相等:"+instanceIsEq+"; hashCode是否相等:"+hashCodeIsEq);
    }
}

/**
 * 懒汉式 (线程安全)
 */

/**
 * 静态方法添加同步锁
 */
class Singleton{

    private Singleton() {}

    private static Singleton instance;

    public static synchronized  Singleton getInstance(){
        if(instance==null){
            instance = new   Singleton();
        }
        return  instance;
    }

}