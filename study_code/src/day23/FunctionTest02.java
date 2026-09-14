package day23;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionTest02 {
    public static void main(String[] args) {
        // 引用类中的成员方法
        // 其他类：
        // 需求：集合中有一些名字，按照要求锅炉数据
        // 数据："张无忌","周芷若","赵敏","张强","张三丰"
        // 要求：只要以张字开头的，而且名字是3个字的

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌","周芷若","赵敏","张强","张三丰");
        // 原写法
//        list.stream()
//                .filter(s->s.startsWith("张"))
//                .filter(s->s.length() == 3)
//                .forEach(s->System.out.println(s));

        // 其他类中方法引用
        list.stream()
                .filter(new StringOperation()::stringJudge)
                .forEach(s->System.out.println(s));
    }
}
