package day12;

public abstract class Coach extends Person{
    //教练
    public Coach(){

    }
    public Coach(String name,int age){
        super(name,age);
    }
    public abstract void teach();
}
