package day08;

public class Lecturer extends Teacher{
    //讲师
    public Lecturer(){

    }
    public Lecturer(String id,String name,String work){
        super(id,name,work);
    }
    @Override
    public void work(){
        System.out.println(this.getName() + "在教研部教书讲解");
    }
}