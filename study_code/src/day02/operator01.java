package day02;

import java.util.Scanner;

public class operator01 {
    public static void main(String[] args){
        //加
        System.out.println(3 + 5);//8
        //减
        System.out.println(8 - 2);//6
        //乘
        System.out.println(5 * 5);//25
        //除
        System.out.println(6 / 2);//3
        System.out.println(5 / 2);//2
        //取余
        System.out.println(8 % 2);//0
        System.out.println(5 % 2);//1

        System.out.println("--------------------------");

        //字符串相加等于拼接
        System.out.println(100 + "年老马");//"100年老马"
        System.out.println("智商" + 250);//智商250

        System.out.println("--------------------------");

        //键盘输入一个三位数，取各个数位上的数字
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number = input.nextInt();
        int ge_number = number % 10;
        int shi_number = (number / 10) % 10;
        int bai_number = (number / 100) % 10;
        System.out.println("个位数是：" + ge_number);//个位
        System.out.println("十位数是：" + shi_number);//十位
        System.out.println("百位数是：" + bai_number);//百位
    }
}
