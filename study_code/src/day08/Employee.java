package day08;

public class Employee {
    //全体员工
    private String id;            //编号
    private String name;          //姓名
    private String work;          //工作

    Employee(){

    }
    Employee(String id, String name, String work) {
        this.id = id;
        this.name = name;
        this.work = work;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWork() {
        return work;
    }
    public void setWork(String work) {
        this.work = work;
    }
    public void work(){
        System.out.println("员工在工作");
    }
}