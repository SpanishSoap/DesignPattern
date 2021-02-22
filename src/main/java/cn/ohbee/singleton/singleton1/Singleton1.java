package cn.ohbee.singleton.singleton1;

public class Singleton1 {
    public static void main(String[] args)  {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        boolean instanceIsEq = instance == instance1;
        boolean hashCodeIsEq =  Integer.valueOf(instance.hashCode()).equals(instance1.hashCode());
        System.out.println(" 实例是否相等:"+instanceIsEq+"; hashCode是否相等:"+hashCodeIsEq);
    }
}

/**
 *  饿汉式 静态变量(此方式线程安全)
 */

/**
 * final 对象构建时候，final 修饰的域就会被赋值；且对象构建成功之后，被修饰的变量将不能再次被修改
 *
 * static 保证被修饰的变量只有一份，被所有对象共享
 */
class Singleton{

    /**
     * 私有化构造器，无法通过 new 生成对象
     */
    private Singleton() {}

    /**
     * 声明一个 final / static 变量，保证在类创建的时候就进行初始化
     */
    private final  static Singleton instance = new Singleton();

    /**
     * 获取单实例
     */
    public static Singleton getInstance(){
        return  instance;
    }

}
