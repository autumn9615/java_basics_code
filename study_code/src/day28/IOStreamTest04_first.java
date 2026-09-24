package day28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class IOStreamTest04_first {
    public static void main(String[] args) throws IOException {
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

        //1.把文件里每一行读出来，装进集合
        ArrayList<String> list1 = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("study_code/src/day28/name.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            // 每读一行就存进集合
            list1.add(line);
        }
        br.close();

        // 拿来存已经点过的人
        ArrayList<String> list2 = new ArrayList<>();

        callName(list1,list2,2);
    }
    public static void callName(ArrayList<String> list1, ArrayList<String> list2, int num){
        for (int i = 0; i < num; i++) {
            if(!list1.isEmpty()){
                // list1不是空的，读取list1
                while(!list1.isEmpty()){
                    //2.用Random随机抽一个下标
                    Random r = new Random();
                    // 范围是 0 ~ 集合长度-1
                    int index = r.nextInt(list1.size());

                    //3.取出这一行，按 "-" 切开，第0段就是姓名
                    String info = list1.get(index);
                    String name = info.split("-")[0];

                    //4.打印结果
                    System.out.println("被点到的同学是：" + name);

                    // 删掉已经点过的人，存入新数组
                    String out = list1.remove(index);
                    list2.add(out);
                }
            }else{
                // list1是空的，读取list2
                while(!list2.isEmpty()){
                    //2.用Random随机抽一个下标
                    Random r = new Random();
                    // 范围是 0 ~ 集合长度-1
                    int index = r.nextInt(list2.size());

                    //3.取出这一行，按 "-" 切开，第0段就是姓名
                    String info = list2.get(index);
                    String name = info.split("-")[0];

                    //4.打印结果
                    System.out.println("被点到的同学是：" + name);

                    // 删掉已经点过的人，存入新数组
                    String out = list2.remove(index);
                    list1.add(out);
                }
            }
            System.out.println("-------第" + (i+1) + "遍读完了-------");
        }
    }
}
