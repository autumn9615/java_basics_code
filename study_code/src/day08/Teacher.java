package day08;

public class Teacher extends Employee{
    //教研部员工
    public Teacher(){

    }
    public Teacher(String id,String name,String work){
        super(id,name,work);
    }
    @Override
    public void work(){
        System.out.println(this.getName() + "员工在教研部工作");
    }
}