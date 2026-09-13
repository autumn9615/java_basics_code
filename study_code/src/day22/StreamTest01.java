package day22;

import java.util.ArrayList;
import java.util.List;

public class StreamTest01 {
    public static void main(String[] args) {
        // stream流练习一：
        // 定义一个集合，并添加一些整数
        // 1,2,3,4,5,7,8,9,10
        // 过滤奇数，只留下偶数
        // 并将结果保存起来

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        List<Integer> arr = list.stream().filter(i->i%2==0).toList();
        System.out.println(arr);
    }
}
