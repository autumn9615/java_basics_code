package day21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class Test03 {
    public static void main(String[] args) {
        // 练习三：
        // 定义一个Map集合，键用表示省份名称province，值表示市city，但是市会有多个
        // 江苏省 = 南京市，扬州市，苏州市，无锡市，常州市
        // 湖北省 = 武汉市，孝感市，十堰市，宜昌市，鄂州市
        // 河北省 = 石家庄市，唐山市，邢台市，保定市，张家口市

        // 1.创建Map集合
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        // 2.添加进去
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("南京市，扬州市，苏州市，无锡市，常州市");
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("武汉市，孝感市，十堰市，宜昌市，鄂州市");
        ArrayList<String> l3 = new ArrayList<>();
        l3.add("石家庄市，唐山市，邢台市，保定市，张家口市");

        map.put("江苏省", l1);
        map.put("湖北省", l2);
        map.put("河北省", l3);

        // 3.遍历打印
        map.forEach(new BiConsumer<String, ArrayList<String>>() {
            @Override
            public void accept(String key, ArrayList<String> value) {
                System.out.println(key + "=" + value);
            }
        });
    }
}
