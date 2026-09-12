package day11;

public class Rabit extends Animal{
    //兔子
    public Rabit(){

    }
    public Rabit(String name,int age){
        super(name,age);
    }
    @Override
    public void eat() {
        System.out.println("兔子在吃胡萝卜");
    }
}
