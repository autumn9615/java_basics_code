package day14;

import java.time.LocalDate;

public class Test03 {
    public static void main(String[] args) {
        //判断一年是闰年还是平年
        //闰年：二月有二十九天
        //闰年：年份数能被4整除不能被100整除/能被400整除

        //jdk8来写

        LocalDate ld = LocalDate.of(2026,01,01);
        //调用isLeapYear方法判断
        if(ld.isLeapYear()){
            System.out.println("是闰年");
        }else{
            System.out.println("是平年");
        }
    }
}
