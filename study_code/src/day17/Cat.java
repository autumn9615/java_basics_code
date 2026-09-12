package day17;

public class Cat extends Animal {
    //猫

    public Cat() {}

    public Cat(String name ,int age) {
        super(name,age);
    }
    @Override
    public void eat() {
        System.out.println("猫在吃东西");
    }
}
