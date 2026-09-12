package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapTest {
    public static void main(String[] args) {
        //存储自定义对象

        HashMap<student, String> map = new HashMap<>();

        //添加元素
        student s1 = new student("zhangsan", 18);
        student s2 = new student("lisi", 19);
        student s3 = new student("wangwu", 20);
        map.put(s1,"重庆綦江");
        map.put(s2,"四川成都");
        map.put(s3,"江苏南京");

        //遍历打印
        //增强for遍历
        System.out.println("增强for遍历:");
        Set<Map.Entry<student, String>> s = map.entrySet();
        for (Map.Entry<student, String> entry : s) {
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }

        System.out.println("--------------------------------");

        //迭代器遍历
        //it.next()就是获取到了下一个元素，返回的是整个元素
        System.out.println("迭代器遍历:");
        Iterator<Map.Entry<student, String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("--------------------------------");
        //Lambda表达式遍历
        System.out.println("完整Lambda表达式遍历:");
        map.forEach(new BiConsumer<student, String>() {
            @Override
            public void accept(student student, String where) {
                System.out.println(student.toString() + "--->" + where);
            }
        });
        System.out.println("--------------------------------");

        System.out.println("简化Lambda表达式遍历:");
        map.forEach((student student, String where) -> System.out.println(student.toString() + "--->" + where));
    }
}
