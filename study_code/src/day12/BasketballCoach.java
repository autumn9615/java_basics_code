package day12;

public class BasketballCoach extends Coach{
    //篮球教练
    public BasketballCoach(){

    }
    public BasketballCoach(String name,int age){
        super(name,age);
    }
    @Override
    public void teach(){
        System.out.println(this.getName() + "教练教学员打篮球");
    }
}
