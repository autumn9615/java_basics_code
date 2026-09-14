package day23;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionTest05 {
    public static void main(String[] args) {
        // 课堂练习3：
        // 创建集合添加学生对象
        // 学生对象属性：name，age
        // 要求：
        // 把姓名和年龄拼接成：张三-23的字符串，并放到数组当中
        // 使用方法引用完成

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",23));
        list.add(new Student("李四",24));
        list.add(new Student("王五",25));

        String[] arr = list.stream()
                .map(Student::toString)
                .toArray(String[]::new);

        // 解法：将toString方法重写再调用方法转为String数组即可
        System.out.println(Arrays.toString(arr));
    }
}
