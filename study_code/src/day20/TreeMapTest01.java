package day20;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest01 {
    public static void main(String[] args) {
        //TreeMap初级练习

        //创建对象
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1 - o2;    升序排列

                //降序排列
                return o2 - o1;
            }
        });

        //添加对象
        tm.put(1, "康师傅");
        tm.put(4, "农夫山泉");
        tm.put(2, "统一");
        tm.put(5, "可口可乐");
        tm.put(3, "外星人");

        //打印
        System.out.println(tm);
    }
}
