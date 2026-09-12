package day09;

public class Animal {
    //动物类
    private int age;           //年龄
    private String color;      //颜色
    public Animal(){

    }
    public Animal(int age, String color){
        this.age = age;
        this.color = color;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //创建吃饭方法
    public void eat(String food){
        System.out.println("动物在吃" + food);
    }
}
