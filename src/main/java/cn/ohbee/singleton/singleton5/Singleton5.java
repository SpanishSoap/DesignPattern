package cn.ohbee.singleton.singleton5;

public class Singleton5 {

    public static void main(String[] args) {
        Singleton instance =    Singleton.getInstance();
        Singleton instance1 =   Singleton.getInstance();
        boolean instanceIsEq = instance == instance1;
        boolean hashCodeIsEq =  Integer.valueOf(instance.hashCode()).equals(instance1.hashCode());
        System.out.println("实例是否相等:"+instanceIsEq+"; hashCode是否相等:"+hashCodeIsEq);
    }
}


/**
 * 双重锁校验 (线程安全)
 */
class Singleton{

    private Singleton() {}

    private static volatile  Singleton instance;

    public static Singleton getInstance(){
        if(instance!=null){
            return  instance;
        }
        synchronized (Singleton.class){
            if(null==instance){
                instance = new Singleton();
            }
        }
        return  instance;
    }

}
