package day20;

import java.util.TreeMap;

public class TreeMapTest02 {
    public static void main(String[] args) {
        TreeMap<student, String> tm = new TreeMap<>();
        //添加元素
        student s2 = new student("lisi", 19);
        student s3 = new student("wangwu", 20);
        student s1 = new student("zhangsan", 18);

        tm.put(s1,"重庆綦江");
        tm.put(s2,"四川成都");
        tm.put(s3,"江苏南京");

        System.out.println(tm);
    }
}
