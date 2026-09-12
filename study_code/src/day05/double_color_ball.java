package day05;

import java.util.Random;
import java.util.Scanner;

public class double_color_ball {
    //双色球彩票模拟
    public static void main(String[] args) {
        //1.机器随机生成的中奖号码
        int[] arr = createNumbers();
        //2.用户输入自己的号码
        int[] userInputArr = userInputNumbers();
        //3.判断球中了多少个
        int redCount = 0;
        int blueCount = 0;
        //判断红球中了多少个
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < userInputArr.length-1; j++) {
                if (arr[i] == userInputArr[j]) {
                    redCount++;
                }
            }
        }
        //判断蓝球中了多少个
        if(arr[arr.length-1] == userInputArr[userInputArr.length-1]){
            blueCount++;
        }
        //4.统计计算中了什么奖
        if(blueCount == 0){
            switch(redCount){
                case 0:
                case 1:
                case 2:
                case 3:
                    System.out.println("很遗憾你没中奖");
                    break;
                case 4:
                    System.out.println("恭喜你！中了10元！");
                    break;
                case 5:
                    System.out.println("恭喜你！中了200元！");
                    break;
                case 6:
                    System.out.println("恭喜你！中了500万元！");
                    break;
            }
        } else{
            switch(redCount){
                case 0:
                case 1:
                case 2:
                    System.out.println("恭喜你！中了5元！");
                    break;
                case 3:
                    System.out.println("恭喜你！中了10元！");
                    break;
                case 4:
                    System.out.println("恭喜你！中了200元！");
                    break;
                case 5:
                    System.out.println("恭喜你！中了3000元！");
                    break;
                case 6:
                    System.out.println("恭喜你！中了1000万元！");
                    break;
            }
        }
    }
    //随机生成中奖号码
    public static int[] createNumbers(){
        int[] arr = new int [7];
        Random random = new Random();
        //随机生成红球号码添加到数组中
        for (int i = 0; i < arr.length-1; i++ ) {
            int redNumber = random.nextInt(1,33);
            boolean flag = contains(arr,redNumber);
            if(flag){
                arr[i] = redNumber;
                i++;
            }
        }
        //随机生成蓝球号码添加到数组中
        int blueNumber = random.nextInt(1,16);
        arr[arr.length - 1] =  blueNumber;
        return arr;
    }
    //用户输入自己的号码
    public static int[] userInputNumbers(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        //用户输入红球号码
        for (int i = 0; i < arr.length-1; ) {
            System.out.println("请输入你的第" + (i+1) + "个红球号码：");
            int redNumber = sc.nextInt();
            if(redNumber >= 1 && redNumber <= 33){
                boolean flag = contains(arr,redNumber);
                if(flag){
                    arr[i] = redNumber;
                    i++;
                }else{
                    System.out.println("录入失败！该号码重复！请重新录入！");
                }
            }else{
                System.out.println("录入失败！超出红球号码范围！请重新录入！");
            }
        }
        //用户输入蓝球号码
        System.out.println("请输入你的蓝球号码：");
        int blueNumber = sc.nextInt();
        while(true){
            if(blueNumber >= 1 && blueNumber <= 16){
                arr[arr.length-1] = blueNumber;
                break;
            }else{
                System.out.println("录入失败！超出蓝球号码范围！请重新录入！");
            }
        }
        return arr;
    }
    //判断数字在数组中是否存在
    public static boolean contains(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return false;
            }
        }
        return true;
    }
}