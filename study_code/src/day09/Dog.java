package day09;

public class Dog extends Animal{
    //狗
    public Dog(){

    }
    public Dog(int age, String color){
        super(age,color);
    }
    @Override
    public void eat(String food){
        System.out.println(getAge() + "岁的" + getColor() + "的狗两只前腿死死的抱住" + food + "猛吃");
    }
    public void lookHome(){
        System.out.println("狗狗在看家");
    }
}
