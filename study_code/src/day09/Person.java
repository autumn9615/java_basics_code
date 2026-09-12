package day09;

public class Person {
    //人
    private String name;      //姓名
    private int age;          //年龄
    public Person(){

    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
//    //饲养狗狗
//    public void keepPet(Dog dog, String food){
//        System.out.println("年龄为" + getAge() + "岁的" + getName() + "养了一只" + dog.getColor() + "的" + dog.getAge() + "岁的宠物");
//        dog.eat(food);
//    }
//    //饲养小猫
//    public void keepPet(Cat cat, String food){
//        System.out.println("年龄为" + getAge() + "岁的" + getName() + "养了一只" + cat.getColor() + "的" + cat.getAge() + "岁的宠物");
//        cat.eat(food);
//    }
    //多态定义方法
    public void keepPet(Animal a, String food){
        System.out.println("年龄为" + getAge() + "岁的" + getName() + "养了一只" + a.getColor() + "的" + a.getAge() + "岁的宠物");
        a.eat(food);
    }
}
