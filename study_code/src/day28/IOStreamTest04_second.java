package day28;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class IOStreamTest04_second {
    /*
     * IO流最终练习：随机点名器4
     * 需求：
     *      有一个文件里面存储了班级同学的信息，每一个信息占一行。
     *      格式为：张三-男-23
     *      要求通过程序实现随机点名器。
     * 运行效果：
     *      被点到的学生不会再被点到
     *      如果班级中所有的学生都点完了，需要自动的重新开启第二轮点名
     *      细节1：假设班级有10个学生，每一轮中每一位学生只能被点到一次，程序运行10次，第一轮结束
     *      细节2：第11次运行的时候，我们自己不需要手动操作本地文件，要求程序自动开始第二轮点名
     * */

    // 定义文件路径（全局）
    public static String in = "study_code/src/day28/name.txt";

    public static void main(String[] args) throws IOException {
        callName(2);
    }
    public static void callName(int num) throws IOException {
        ArrayList<String> all = new ArrayList<>();
        // 创建缓冲流读取文件
        BufferedReader br = new BufferedReader(new FileReader(in));
        //1.把文件里每一行读出来，装进集合
        String line;
        while ((line = br.readLine()) != null) {
            // 每读一行就存进集合
            all.add(line);
        }
        br.close();
        // 随机抽取
        Random r = new Random();
        for (int i = 0; i < num; i++) {
            // 每轮都创建新的集合拿来存点名名单
            ArrayList<String> list = new ArrayList<>(all);

            while (!list.isEmpty()) {
                // 随机一个下标索引
                int index = r.nextInt(list.size());
                String name = list.get(index).split("-")[0];
                System.out.println("被点到的同学是：" + name);
                // 删除已经读了的
                list.remove(index);
            }
            System.out.println("-------这是第" + (i + 1) + "遍-------");
        }
    }
}
