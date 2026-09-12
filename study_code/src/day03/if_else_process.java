package day03;

import java.util.Scanner;

public class if_else_process {
    public static void main(String[] args){
        //电影院选座，奇数坐左边，偶数坐右边（0-100）
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的票号：");
        int num = sc.nextInt();
        if(num >= 0 & num <= 100){
            if(num % 2 == 0){
                System.out.println("你坐在场馆右边");
            }else{
                System.out.println("你坐在场馆左边");
            }
        }else{
            System.out.println("你的票号输入出错！！！");
        }
    }
}
