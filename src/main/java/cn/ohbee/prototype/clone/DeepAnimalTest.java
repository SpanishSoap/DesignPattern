package cn.ohbee.prototype.clone;

public class DeepAnimalTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepAnimal animal = new DeepAnimal("哺乳类", new Sheep("绵🐏"));
        DeepAnimal cloneAnimal = animal.clone();
        System.out.println("深拷贝是否为同一对象: "+ (animal.getSheep().hashCode()==cloneAnimal.getSheep().hashCode()));
    }
}
