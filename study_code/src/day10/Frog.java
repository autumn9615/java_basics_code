package day10;

public class Frog extends Animal{
    //青蛙
    public Frog(){

    }
    public Frog(String name, int age){
        super(name,age);
    }
    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }
}
