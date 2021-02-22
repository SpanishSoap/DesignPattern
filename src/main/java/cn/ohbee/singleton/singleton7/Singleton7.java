package cn.ohbee.singleton.singleton7;

public class Singleton7 {
    public static void main(String[] args) {
        Singleton instance =    Singleton.INSTANCE;
        Singleton instance1 =   Singleton.INSTANCE;
        boolean instanceIsEq = instance == instance1;
        boolean hashCodeIsEq =  Integer.valueOf(instance.hashCode()).equals(instance1.hashCode());
        instance.test();
        System.out.println("实例是否相等:"+instanceIsEq+"; hashCode是否相等:"+hashCodeIsEq);
    }
}

/**
 *  使用枚举解决单例问题 (线程安全)
 */

/**
 *  Effective Java作者推荐的解决方式
 */
enum Singleton{
    INSTANCE;
    public void test(){
        System.out.println("hi~");
    }
}