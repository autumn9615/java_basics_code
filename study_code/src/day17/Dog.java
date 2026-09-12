package day17;

public class Dog extends Animal {
    //狗

    public Dog() {}

    public Dog(String name,int age) {
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("狗在吃东西");
    }
}
