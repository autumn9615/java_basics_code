package day22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    public static void main(String[] args) {
        // stream流练习二：
        // 现在有两个ArrayList集合
        // 一个集合中：存储6名男演员的名字和年龄。
        // 第二个集合中：存储6名女演员的名字和年龄。
        // 姓名和年龄中间用逗号隔开。比如：张三，23

        // 要求完成以下操作：
        // 1.男演员只要名字为3各自的前两人
        // 2.女演员只要姓杨的。并且不要第一个
        // 3.把过滤后的男演员和女演员姓名和女演员姓名合并到一起
        // 4.将上一步的演员信息封装成Actor对象
        // 5.将所有的演员对象都保存到List集合中

        // 男演员： "蔡坤坤,24" , "叶胸咸,23" , "刘不甜,22" , "吴签,24" , "谷嘉,30" , "肖梁梁,27"
        // 女演员： "赵小颖,35" , "杨颖,36" , "高元元,43" , "张天天,31" , "刘诗,35" , "杨小幂,33"

        ArrayList<String> manlist = new ArrayList<>();
        ArrayList<String> womanlist = new ArrayList<>();
        Collections.addAll(manlist,"蔡坤坤,24" , "叶胸咸,23" , "刘不甜,22" , "吴签,24" , "谷嘉,30" , "肖梁梁,27");
        Collections.addAll(womanlist,"赵小颖,35" , "杨颖,36" , "高元元,43" , "张天天,31" , "刘诗,35" , "杨小幂,33");

        // 1.男演员只要名字为3各自的前两人
        Stream<String> stream1 = manlist.stream()
                .filter(s -> s.split(",")[0].length() == 3);

        // 2.女演员只要姓杨的。并且不要第一个
        Stream<String> stream2 = womanlist.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);

        // 3.把过滤后的男演员和女演员姓名和女演员姓名合并到一起
        // 完整写法
//        Stream
//                .concat(stream1, stream2)
//                .map(new Function<String, Actor>() {
//                    @Override
//                    public Actor apply(String s) {
//
//                        String name = s.split(",")[0];
//                        int age = Integer.parseInt(s.split(",")[1]);
//                        new Actor(name,age);
//                        return new Actor(name,age);
//                    }
//                }).forEach(a->System.out.println(a));

        // 精简写法
        List<Actor> list = Stream
                .concat(stream1, stream2)
                .map(s->new Actor(s.split(",")[0],Integer.parseInt(s.split(",")[1])))
                .toList();

        System.out.println(list);
    }
}
