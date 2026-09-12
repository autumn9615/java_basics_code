package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapTest03 {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式
        //通过键值对对象进行遍历

        //1.创建Map对象
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        map.put("漩涡鸣人", "日向雏田");
        map.put("宇智波佐助", "春野樱");
        map.put("波风水门","玖辛奈");

        //3.通过一个方法获取所有的键值对对象，返回一个set集合

        //增强for遍历
        System.out.println("增强for遍历:");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //遍历entries集合，得到每一个键值对
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "===" + entry.getValue());
        }

        System.out.println("--------------------------------");

        //迭代器遍历
        System.out.println("迭代器遍历:");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("--------------------------------");

        //Lambda表达式遍历
        System.out.println("完整Lambda表达式遍历:");
        entries.forEach(entry -> {
            System.out.println(entry.getKey() + "===" + entry.getValue());
        });

        System.out.println("--------------------------------");

        System.out.println("简化Lambda表达式遍历:");
        entries.forEach(entry -> System.out.println(entry.getKey() + "===" + entry.getValue()));
    }
}
