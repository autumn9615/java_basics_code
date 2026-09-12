package day17;

public class LiHuaCat extends Cat{
    //狸花猫

    public LiHuaCat() {}

    public LiHuaCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + this.getName() + "的，" + this.getAge() + "岁的狸花猫，正在吃鱼");
    }
}
