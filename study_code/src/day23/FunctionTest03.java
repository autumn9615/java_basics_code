package day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FunctionTest03 {
    public static void main(String[] args) {
        // 课堂练习1：集合中存储一些字符串的数据，比如：张三，23。
        // 收集到Student类型的数组当中（使用方法引用完成）

        //    "诸葛亮,95", "曹操,88", "刘备,72", "孙权,80",
        //    "关羽,91", "张飞,65", "赵云,93", "司马懿,89",
        //    "周瑜,87", "吕布,60", "貂蝉,78", "郭嘉,92"

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"诸葛亮,95", "曹操,88", "刘备,72", "孙权,80","关羽,91",
                "张飞,65", "赵云,93", "司马懿,89","周瑜,87", "吕布,60", "貂蝉,78", "郭嘉,92");
        Student[] arr = list.stream()
                .map(Student::new)
                .toArray(Student[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
