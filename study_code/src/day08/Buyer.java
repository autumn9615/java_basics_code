package day08;

public class Buyer extends AdminStaff{
    //采购专员
    public Buyer(){

    }
    public Buyer(String id,String name,String work){
        super(id,name,work);
    }
    @Override
    public void work(){
        System.out.println(this.getName() + "在行政部采购物资");
    }
}