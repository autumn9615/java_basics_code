package day08;

public class AdminStaff extends Employee{
    //行政部员工
    public AdminStaff(){

    }
    public AdminStaff(String id,String name,String work){
        super(id,name,work);
    }
    @Override
    public void work(){
        System.out.println(this.getName() + "员工在行政部工作");
    }
}