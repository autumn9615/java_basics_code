package day21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        // 练习一：
        // 班级里有n个学生，学生属性是：姓名，年龄，性别
        // 实现随机点名器（两种方法）


        // 1.Collections工具类实现
        ArrayList<String> list = new ArrayList<>();

        //李强	    男
        //欧阳明月	女
        //张伟	    男
        //陈思琪	    女
        //王浩宇	    男
        //刘洋	    男
        //赵天乐	    男
        //孙雪	    女
        //周嘉懿	    女
        //吴迪	    男

        Collections.addAll(list, "李强", "欧阳明月", "张伟", "陈思琪",
                "王浩宇", "刘洋", "赵天乐", "孙雪", "周嘉懿", "吴迪");

        // 打乱前：
        System.out.println(list);
        // 打乱后
        Random random = new Random();
        System.out.println(list.get(random.nextInt(1,list.size())) + "! 你被抽到了！");

        System.out.println("----------------------------");

        // 2.Collections工具类自带的实现随机
        Collections.shuffle(list);
        System.out.println(list.get(0) + "! 你被抽到了！");
    }
}
