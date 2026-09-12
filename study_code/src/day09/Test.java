package day09;

public class Test {
    public static void main(String[] args) {
        //测试类
        Person p1 = new Person("老王",24);
        Dog d =  new Dog(3,"黑色");
        p1.keepPet(d,"骨头");
        d.lookHome();
        System.out.println("=======================================");
        Person p2 = new Person("老李",28);
        Cat c = new Cat(5,"白色");
        p2.keepPet(c,"小鱼干");
        c.catchMouse();
    }
}
