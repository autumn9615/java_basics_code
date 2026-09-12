package day09;

public class Cat extends Animal {
    //猫
    public Cat(){

    }
    public Cat(int age, String color){
        super(age,color);
    }
    @Override
    public void eat(String food){
        System.out.println(getAge() + "岁的" + getColor() + "的猫咪眯着眼睛侧着头吃" + food);
    }
    public void catchMouse(){
        System.out.println("小猫在捉老鼠");
    }
}
