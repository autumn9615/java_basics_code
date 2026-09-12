package day16;

public class Test01 {
    public static void main(String[] args) {
        //斐波那契数列问题
        //递归解决，求第十二个月的兔子数量

        System.out.println("第" + 12 + "个月的兔子数量为：" + getSum(12));
    }
    public static int getSum(int month){
        //递归出口
        if(month == 1 || month == 2){
            return 1;
        }
        return getSum(month - 1) +  getSum(month - 2);
    }
}
