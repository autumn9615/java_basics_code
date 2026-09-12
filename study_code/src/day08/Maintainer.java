package day08;

public class Maintainer extends AdminStaff{
    //维护专员
    public Maintainer(){

    }
    public Maintainer(String id,String name,String work){
        super(id,name,work);
    }
    @Override
    public void work(){
        System.out.println(this.getName() + "在行政部维护设备");
    }
}