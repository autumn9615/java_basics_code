package day08;

public class Test {
    public static void main(String[] args) {
        Lecturer l = new Lecturer("001","张老师","讲课");
        System.out.println(l.getId() + ", " +  l.getName() + ", " + l.getWork());
        l.work();
        System.out.println("===================================");
        Tutor t = new Tutor("002","李助教","帮助教学");
        System.out.println(t.getId() + ", " +  t.getName() + ", " + t.getWork());
        t.work();
        System.out.println("===================================");
        Maintainer m = new Maintainer("003","赵维护专员","维护");
        System.out.println(m.getId() + ", " +  m.getName() + ", " + m.getWork());
        m.work();
        System.out.println("===================================");
        Buyer b = new Buyer("004","王采购专员","采购");
        System.out.println(b.getId() + ", " +  b.getName() + ", " + b.getWork());
        b.work();
    }
}
