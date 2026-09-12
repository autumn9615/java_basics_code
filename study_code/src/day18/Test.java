package day18;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        //测试类
        //创建几个学生对象
        //按照总分高低输出到控制台
        //如果总分一样，按照语文成绩排
        //如果语文一样，按照数学成绩排
        //如果数学一样，按照英语成绩排
        //如果英语一样，按照年龄排
        //如果年龄一样，按照姓名的字母顺序排
        //如果都一样，认为是同一个学生，不存储

        Student s1 =  new Student("zhangshan",23,90,99,50);
        Student s2 =  new Student("lisi",24,90,98,50);
        Student s3 =  new Student("wangwu",25,95,100,30);
        Student s4 =  new Student("zhaoliu",26,60,99,70);
        Student s5 =  new Student("qianqi",26,70,80,70);

        //创建TreeSet集合来存数据
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //这样排出来默认的是从小到大的顺序（从大到小的话就用o - this）
        for(Student s: ts){
            System.out.println(s);
        }
    }
}
