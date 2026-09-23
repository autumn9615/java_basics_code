package day28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class IOStreamTest02 {
    public static void main(String[] args) throws IOException {
        /*
         * IO流最终练习：随机点名器2
         * 需求：
         *      有一个文件里面存储了班级同学的信息，每一个信息占一行。
         *      格式为：张三-男-23
         *      要求通过程序实现随机点名器。
         * 运行效果：
         *      70%的概率随机到男生
         *      30%的概率随机到女生
         *      总共随机100万次，统计结果
         *      注意观察：看男生和女生的比例是不是接近于7:3
         * */

        ArrayList<String> boys = new ArrayList<>();
        ArrayList<String> girls =  new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("study_code/src/day28/name.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            if(line.split("-")[1].equals("男")){
                boys.add(line);
            }else{
                girls.add(line);
            }
        }
        br.close();

        int[] arr = {0,0,0,1,1,1,1,1,1,1};
        Random random = new Random();

        long boyIndex = 0L;
        long girlIndex = 0L;
        for (int i = 0; i < 1000000; i++) {
            int num = arr[random.nextInt(arr.length)];
            if(num == 0){
                // 随机到女生
//                String name = girls.get(random.nextInt(girls.size())).toString().split("-")[0];
//                System.out.println("被点到的女同学是：" + name);
                girlIndex++;
            }else if(num == 1){
                // 随机到男生
//                String name = boys.get(random.nextInt(boys.size())).toString().split("-")[0];
//                System.out.println("被点到的男同学是：" + name);
                boyIndex++;
            }
        }

        System.out.println("被点到女同学的次数：" + girlIndex);
        System.out.println("被点到男同学的次数：" + boyIndex);
    }
}
