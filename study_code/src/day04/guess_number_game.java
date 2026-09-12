package day04;

import java.util.Random;
import java.util.Scanner;

public class guess_number_game {
    public static void main(String[] args){
        //系统生成一个随机数，范围1-100
        Random random=new Random();
        int answer = random.nextInt(100) + 1;
        //死循环一直猜数，直到猜中
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入你猜的答案：");
            int guess_number=sc.nextInt();
            //程序判断猜的怎么样，大了，小了，猜中了
            if(guess_number == answer){
                System.out.println("猜中了!!!");
                break;
            }else if(guess_number > answer){
                System.out.println("大了");
            }else{
                System.out.println("小了");
            }
        }
    }
}
