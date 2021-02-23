# 单例模式
## 一. 概述
- 在GoF一书中设计模式如下分类
  - 创建模式(Creational Patterns)
    - Singleton [单例模式](https://github.com/SpanishSoap/DesignPattern/tree/master/src/main/java/cn/ohbee/singleton)
    - Factory Method
    - Abstract Factory
    - Builder
    - Prototype
  - 结构模式(Structural Patterns) 
    - Adapter
    - Bridge
    - Composite
    - Decorator
    - Facade
    - Flyweight
    - Proxy
  - 行为模式(Behavioral Patterns)
    - Chain of Responsibility
    - Command
    - Interpreter
    - Iterator
    - Mediator
    - Memento
    - Observer
    - State
    - Strategy
    - Template Method
    - Visitor
## 二. 单例模式介绍
- Singleton模式的意图是：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
- Singleton模式下，每个应用程序中的每个对象都使用Singleton类的同一实例，在一个协作对象对Singleton类所作的修改对于另一个协作对象是可见的。
- Singleton模式需要注意如下两点：
  - 为了确保类不被构造函数实例化，需要将类的构造函数定义为保护或者私有的。
  - 对外提供一个特殊方法，调用这个方法的时候，检查对象是否已经实例化。如果已经实例化，该方法仅返回对象的一个引用。如果尚未实例化，该方法实例化该对象并返回对此新实例的一个引用。
## 三. 单例模式的实现
#### 1. 懒汉式 (线程不安全)
```java
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
```
- 单例模式不允许外部实例化，所以我们将构造函数标记为私有 `private Singleton() {}`
- 此种方式虽然满足了懒加载，但是对于多线程，依旧会造成多实例并存的现象。
#### 2. 懒汉式 (线程安全)
```java
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
```
- 此种方式与上述方式唯一不同的地方是给方法上了锁，添加了`synchronized`关键字。
- 此种方式实现了线程安全，但是每次访问的时候不论对象是否已经实例化过，都需要使用锁，占用资源，影响性能，所以`不建议使用此种方式实现单例模式`。
#### 3. 饿汉式 - 静态变量初始化 (线程安全)
```java
class Singleton{

    private Singleton() {}

    private final  static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return  instance;
    }

}
```
- 在类加载的时候`Singleton`类就直接初始化了，此种方式是线程安全的，但并不是懒加载，无论我们程序中是否用到此类都会被创建。
#### 4. 饿汉式 - 静态代码块初始化 (线程安全)
```java
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
```
- 此种方式与上述方式基本相同，静态代码块中的代码在类加载的时候也一并执行。此种方式是线程安全的，但并不是懒加载，无论我们程序中是否用到此类都会被创建。
#### 5. 双重锁校验 (线程安全)
```java
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
```
- 双重锁校验(Double-Checked Locking)模式是方法级别加锁(synchronized)的优化，拥有懒加载的特性，同时也保证了线程安全性。
#### 6. 静态内部类方式 (线程安全)
```java
class Singleton{
    
    private Singleton() {}

    private static class  SingletonHolder{
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return  SingletonHolder.instance;
    }
}
```
- 使用静态内部类的方式，既保证了懒加载又保证了线程安全，当调用`getInstance()`时，才会加载 Singleton 实例。
- JVM虚拟机在加载类时候，保证了多线程的安全性，这种方式也是`比较推荐的一种方式`。
#### 7. 使用枚举解决单例问题 (线程安全)
```java
enum Singleton{
    INSTANCE;
    public void test(){
        System.out.println("hi~");
    }
}
```
- Effective Java作者推荐的解决方式，这种方式保证了线程安全，单一实例。
## 四. 单例模式的应用
- 在JDK源码中 Runtime 使用了单例模式，如下:
```java
public class Runtime {
  private static final Runtime currentRuntime = new Runtime();

  public static Runtime getRuntime() {
    return currentRuntime;
  }

  private Runtime() {
  }
}
```
> 每个 Java 应用程序都有一个 Runtime 类实例，使应用程序能够与其运行的环境相连接。例如获取 Java 虚拟机中的空闲内存量、总内存量、处理器内核数量等等。
