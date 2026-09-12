package day10;

public class Sheep extends Animal{
    //山羊
    public Sheep(){

    }
    public Sheep(String name, int age){
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println("山羊在吃草");
    }
}
