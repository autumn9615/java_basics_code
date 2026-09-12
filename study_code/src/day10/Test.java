package day10;

public class Test {
    public static void main(String[] args) {
        //测试类
        Frog f =  new Frog("小青蛙",2);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.drink();
    }
}
