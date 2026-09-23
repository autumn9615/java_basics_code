package day28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class IOStreamTest03 {
    public static void main(String[] args) throws IOException {
        /*
         * IO流最终练习：随机点名器3
         * 需求：
         *      有一个文件里面存储了班级同学的信息，每一个信息占一行。
         *      格式为：张三-男-23
         *      要求通过程序实现随机点名器。
         *      第三次必定是张三同学
         * 运行效果：
         *      第一次运行程序：随机同学姓名（只显示名字）
         *      第二次运行程序：随机同学姓名（只显示名字）
         *      第三次运行程序：张三
         * */

        //1.把文件里每一行读出来，装进集合
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("study_code/src/day28/name.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            // 每读一行就存进集合
            list.add(line);
        }
        br.close();

        for (int i = 0; i < list.size(); i++) {
            if(i == 2){
                //第三次运行程序：张三
                System.out.println("被点到的同学是：张三");
            }else{
                //2.用Random随机抽一个下标
                Random r = new Random();
                // 范围是 0 ~ 集合长度-1
                int index = r.nextInt(list.size());

                //3.取出这一行，按 "-" 切开，第0段就是姓名
                String info = list.get(index);
                String name = info.split("-")[0];

                //4.打印结果
                System.out.println("被点到的同学是：" + name);
            }
        }
    }
}
