package day11;

public class Test {
    public static void main(String[] args) {
        //测试类
        Frog f = new Frog("小绿",2);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.swim();

        Rabit r = new Rabit("小白",1);
        System.out.println(r.getName() + ", " + r.getAge());
        r.eat();
    }
}
