package day07;

import java.util.Random;
import java.util.Scanner;

public class String_Practice02 {
    public static void main(String[] args) {
        //键盘录入字符串，随机打乱里面的内容

        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符串：");
        String str1 = sc.nextLine();
        //将字符串转变为字符数组
        char[] arr = str1.toCharArray();
        //生成随机数来表示索引
        Random index = new Random();
        //循环遍历打乱顺序
        for (int i = 0; i < arr.length;) {
            int num = index.nextInt(1,arr.length);
            if(num != i){
                char temp = arr[i];
                arr[i] = arr[num];
                arr[num] = temp;
                //满足了条件才继续
                i++;
            }
        }
        //转变回字符串
        String str2 = new String(arr);
        //输出结果
        System.out.println("随机之后的结果为：");
        System.out.println(str2);
    }
}