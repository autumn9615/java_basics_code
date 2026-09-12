package day20;

import java.util.Objects;

public class student implements Comparable<student>{
    //学生类

    String name;
    int age;

    public student(){}
    public student(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    //重写
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString(){
        return ("{姓名：" + this.getName() + "  年龄：" +  this.getAge() + "}");
    }

    //重写接口Comparable的方法
    @Override
    public int compareTo(student o) {
        //按照学生的年龄的升序排序，年龄一样按照姓名的字母排序，同姓名年龄视为同一个人
        int i = this.getAge() - o.getAge();
        i = i == 0 ?  this.getName().compareTo(o.getName()) : i;
        return i;
    }
}
