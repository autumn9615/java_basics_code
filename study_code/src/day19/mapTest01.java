package day19;

import java.util.HashMap;
import java.util.Map;

public class mapTest01 {
    public static void main(String[] args) {
        //常见API练习

        //创建对象
        Map<String,String> map = new HashMap<>();

        //put
        map.put("漩涡鸣人", "日向雏田");
        map.put("宇智波佐助", "春野樱");
        map.put("波风水门","玖辛奈");

        //删除
        //map.remove("波风水门");

        //打印测试
        //System.out.println(map);

        //判断是否包含指定的键
        //System.out.println(map.containsKey("波风水门"));

        //判断是否为空
        //System.out.println(map.isEmpty());

        //清空
        //map.clear();

        //判断是否包含指定的键
        System.out.println(map.containsKey("波风水门"));

        //判断是否为空
        System.out.println(map.isEmpty());

        //集合长度
        System.out.println(map.size());

        //打印测试
        System.out.println(map);
    }
}
