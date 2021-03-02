package cn.ohbee.prototype.clone;

public class Animal implements Cloneable{
    private String name;

    private  Sheep sheep;

    public Animal(String name, Sheep sheep) {
        this.name = name;
        this.sheep = sheep;
    }

    public Sheep getSheep() {
        return sheep;
    }

    @Override
    protected Animal clone() throws CloneNotSupportedException {
        return (Animal)super.clone();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", sheep=" + sheep +
                '}';
    }
}
