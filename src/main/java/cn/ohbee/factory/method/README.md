# 工厂方法模式(Factory Method)
## 一. 概述
- 在GoF一书中设计模式如下分类
    - 创建模式(Creational Patterns)
        - Singleton [单例模式](https://github.com/SpanishSoap/DesignPattern/tree/master/src/main/java/cn/ohbee/singleton)
        - Factory Method [工厂方法模式](https://github.com/SpanishSoap/DesignPattern/tree/master/src/main/java/cn/ohbee/factory/method)
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
## 二. 工厂方法模式介绍
- Factory Method 模式是一个旨在帮助`创建责任分配`的模式。经典的《设计模式》一书中对其的定义是: 定义一个用于创建对象的接口,让子类决定实例化哪一个类。Factory Method 使一个类的实例化延迟到其子类。
- Factory Method 模式解决了如下问题: 一个类需要实例化另一个类的派生类，单不知道是哪一个。Factory Method 允许派生类进行决策。派生类对实例化哪个类和如何实例化做出决策。
## 三. 工厂方法模式通用类图
- 下面类图为工厂方法模式通用关系
![image](https://media.ohbee.cn/blog_thumbnail_39.jpg)
## 四. JDK源码中对工厂方法的应用
- 在JDK源码中 集合(Collection)使用了工厂方法。其中`iterator`方法返回被请求集合中迭代器的正确类型。
- AbstractCollection 抽象类中
```java
public abstract class AbstractCollection<E> implements Collection<E> {
    protected AbstractCollection() {
    }

    public abstract Iterator<E> iterator();

    public boolean contains(Object o) {
        Iterator<E> it = this.iterator();
        if (o == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (o.equals(it.next())) {
                    return true;
                }
            }
        }

        return false;
    }
    //...
}
```
> AbstractCollection 抽象类中的实现方法(contains,remove,clear)等方法使用到了Iterator类，单此类是通过抽象方法`abstract Iterator<E> iterator()`定义的，而具体`iterator()`是由`AbstractCollection`子类提供的。
- AbstractCollection中的子类`ArrayDeque`实现了`iterator()`方法,将实例化的时机推迟到了子类中
```java
public class ArrayDeque<E> extends AbstractCollection<E> {
    //...
    public Iterator<E> iterator() {
        return new AbstractList.Itr();
    }
    //...
}
```
- AbstractCollection中的子类`AbstractList`实现了`iterator()`方法,将实例化的时机推迟到了子类中
```java
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E> {
    //...
    public Iterator<E> iterator() {
        return new AbstractList.Itr();
    } 
    //...
}
```
- 上述范例可以看到`AbstractCollection`使用了抽象工厂方法，当我们使用到具体实现类`ArrayDeque`时，初始化`Iterator`实例。
