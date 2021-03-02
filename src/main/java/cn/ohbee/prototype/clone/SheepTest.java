package cn.ohbee.prototype.clone;

class SheepTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("Dolly");
        Sheep cloneSheep = sheep.clone();
        System.out.println(sheep);
        System.out.println(cloneSheep);
        System.out.println(sheep.hashCode());
        System.out.println(cloneSheep.hashCode());
        System.out.println(sheep==cloneSheep);
        System.out.println(sheep.getClass()==cloneSheep.getClass());
    }
}