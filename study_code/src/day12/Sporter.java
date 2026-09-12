package day12;

public abstract class Sporter extends Person{
    //运动员
    public Sporter(){

    }
    public Sporter(String name,int age){
        super(name,age);
    }
    public abstract void sport();
}
