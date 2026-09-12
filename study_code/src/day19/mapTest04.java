package day19;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class mapTest04 {
    public static void main(String[] args) {
        //Map集合的第三种遍历方式
        //Lambda表达式遍历

        //1.创建Map对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素
        map.put("漩涡鸣人", "日向雏田");
        map.put("宇智波佐助", "春野樱");
        map.put("波风水门", "玖辛奈");

        System.out.println("完整Lambda表达式遍历:");
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ":" + value);
            }
        });
        System.out.println("--------------------------------");

        System.out.println("简化Lambda表达式遍历:");
        map.forEach((String key, String value) -> System.out.println(key + ":" + value));
    }
}
