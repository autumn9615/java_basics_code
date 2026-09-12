package day12;

public class Test {
    public static void main(String[] args) {
        //测试类
        PingpongSporter pps = new PingpongSporter("李四",22);
        System.out.println(pps.getName() + ", " + pps.getAge());
        pps.sport();
        pps.spaekEnglish();
        PingpongCoach ppc = new PingpongCoach("张三",32);
        System.out.println(ppc.getName() + ", " + ppc.getAge());
        ppc.spaekEnglish();
        ppc.teach();
    }
}
