package cn.ohbee.prototype.clone;

public class AnimalTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal animal = new Animal("哺乳类", new Sheep("绵🐏"));
        Animal cloneAnimal = animal.clone();
        System.out.println(animal);
        System.out.println(cloneAnimal);

        Sheep sheep = animal.getSheep();
        Sheep cloneSheep = cloneAnimal.getSheep();
        System.out.println("是否为同一对象 " + (sheep.hashCode()==cloneSheep.hashCode()));
    }
}
