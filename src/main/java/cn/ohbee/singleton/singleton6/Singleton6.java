package cn.ohbee.singleton.singleton6;

public class Singleton6 {

    public static void main(String[] args) {
        Singleton instance =    Singleton.getInstance();
        Singleton instance1 =   Singleton.getInstance();
        boolean instanceIsEq = instance == instance1;
        boolean hashCodeIsEq =  Integer.valueOf(instance.hashCode()).equals(instance1.hashCode());
        System.out.println("实例是否相等:"+instanceIsEq+"; hashCode是否相等:"+hashCodeIsEq);
    }
}

/**
 * 静态内部类方式 (线程安全)
 */

/**
 * 当 Singleton 类加载的时候内部类不会别加载，当调用 getInstance 方法时，内部类才会被加载
 */
class Singleton{
    private Singleton() {}

    private static class  SingletonHolder{
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return  SingletonHolder.instance;
    }
}