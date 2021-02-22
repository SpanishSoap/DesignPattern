package cn.ohbee.singleton.singleton3;

public class Singleton3 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        boolean instanceIsEq = instance == instance1;
        boolean hashCodeIsEq = Integer.valueOf(instance.hashCode()).equals(instance1.hashCode());
        System.out.println("实例是否相等:" + instanceIsEq + "; hashCode是否相等:" + hashCodeIsEq);
    }
}


/**
 * 懒汉式 (线程不安全)
 */

/**
 * 静态方法中判断实例是否生成
 */
class Singleton{

    private Singleton() {}

    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return  instance;
    }
}