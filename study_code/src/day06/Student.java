package day06;

public class Student {
    //定义成员变量
    //生成标准的Java been
    private int id;                   //学号
    private String name;              //姓名
    private int age;                  //年龄
    //定义空参构造
    public Student(){
    }
    //定义带参构造
    public Student(int id,  String name, int age){
        this.id = id;                 //学号
        this.name = name;             //姓名
        this.age = age;               //年龄
    }
    //定义各个成员变量的get和set
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
