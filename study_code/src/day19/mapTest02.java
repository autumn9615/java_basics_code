package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class mapTest02 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式
        //通过键找值

        //1.创建Map对象
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        map.put("漩涡鸣人", "日向雏田");
        map.put("宇智波佐助", "春野樱");
        map.put("波风水门","玖辛奈");

        //3.通过键找值
        //把所有的键放到一个单列集合中
        Set<String> keys = map.keySet();
        //遍历单列集合，得到每一个值

        //增强for遍历
        System.out.println("增强for遍历:");
        for (String key : keys) {
            //map.get(key)方法可以获取到key对应的值
            System.out.println(key + ":" + map.get(key));
        }

        System.out.println("--------------------------------");

        //迭代器遍历
        System.out.println("迭代器遍历:");
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key + ":" + map.get(key));
        }

        System.out.println("--------------------------------");

        //Lambda表达式遍历
        System.out.println("完整Lambda表达式遍历:");
        keys.forEach(new Consumer<String>() {
            @Override
            public void accept(String key) {
                System.out.println(key + ":" + map.get(key));
            }
        });

        System.out.println("--------------------------------");

        System.out.println("简化Lambda表达式遍历:");
        keys.forEach(key -> System.out.println(key + ":" + map.get(key)));
    }
}
