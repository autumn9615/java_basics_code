package day08;

public class Tutor extends Teacher{
    //助教
    public Tutor(){

    }
    public Tutor(String id,String name,String work){
        super(id,name,work);
    }
    @Override
    public void work(){
        System.out.println(this.getName() + "在教研部辅助教学");
    }
}