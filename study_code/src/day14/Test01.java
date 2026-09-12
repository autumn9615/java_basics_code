package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        //键盘录入一些1-100之间的整数，并添加到集合中
        //直到集合所有的数据超过200为止

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (count < 200) {
            System.out.println("请输入一个1-100之间的整数：");
            int n = Integer.parseInt(sc.nextLine());
            if (n < 1 || n > 100) {
                System.out.println("输入失败超出范围！请重新输入！");
            } else {
                list.add(n);
                count = count + n;
            }
        }
        System.out.println("输入的数总和已经超过200！现在总和为：" + count);
    }
}
