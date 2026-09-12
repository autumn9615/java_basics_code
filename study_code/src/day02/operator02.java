package day02;

import java.util.Scanner;

public class operator02 {
    public static void main(String[] args) {
        //约会匹配，时髦程度大于等于则匹配成功
        int girl_fashion = 6;
        System.out.println("请输入你的时髦程度：");
        Scanner sc=new Scanner(System.in);
        int my_fashion=sc.nextInt();
        System.out.println(my_fashion > girl_fashion);
    }
}
