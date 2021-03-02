package cn.ohbee.prototype.clone;

public class Sheep implements Cloneable{
    private String name;

    public Sheep(String name) {
        this.name = name;
    }

    @Override
    public Sheep clone() throws CloneNotSupportedException {
        return (Sheep)super.clone();
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                '}';
    }
}
