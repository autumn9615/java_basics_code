package day12;

public class BasketballSporter extends Sporter{
    //篮球运动员
    public BasketballSporter(){

    }
    public BasketballSporter(String name,int age){
        super(name,age);
    }
    @Override
    public void sport(){
        System.out.println(this.getName() + "运动员学打篮球");
    }
}
