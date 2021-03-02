package cn.ohbee.prototype.clone;

public class DeepAnimal implements Cloneable{
    private String name;

    private  Sheep sheep;

    public DeepAnimal(String name, Sheep sheep) {
        this.name = name;
        this.sheep = sheep;
    }

    public Sheep getSheep() {
        return sheep;
    }

    @Override
    protected DeepAnimal clone() throws CloneNotSupportedException {
        DeepAnimal clone = (DeepAnimal) super.clone();
        clone.sheep = sheep.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", sheep=" + sheep +
                '}';
    }
}
