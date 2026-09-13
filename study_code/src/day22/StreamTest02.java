package day22;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest02 {
    public static void main(String[] args) {
        // stream流练习二：
        // 创建一个ArrayList集合，并添加以下字符串，字符串中前面是姓名，后面是年龄
        // "zhangshan, 23"
        // "lisi, 24"
        // "wangwu, 25"
        // 保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值

        ArrayList<String> list = new ArrayList<>();
        list.add("zhangshan,23");
        list.add("lisi,24");
        list.add("wangwu,25");

        // 完全式
//
//        Map<String, Integer> map = list.stream()
//                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
//                .collect(Collectors.toMap(new Function<String, String>() {
//                    @Override
//                    public String apply(String s) {
//                        return s.split(",")[0];
//                    }
//                }, new Function<String, Integer>() {
//                    @Override
//                    public Integer apply(String s) {
//                        return Integer.parseInt(s.split(",")[1]);
//                    }
//                }));

        // lambda表达式
        Map<String, Integer> map = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(
                        s -> s.split(",")[0],
                        s -> Integer.parseInt(s.split(",")[1])));

        System.out.println(map);
    }
}
