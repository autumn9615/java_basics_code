package day16;

public class Test03 {
    public static void main(String[] args) {
        //小明爬楼梯问题
        //小明爬楼梯有的时候一次爬一个台阶，有的时候一次爬两个台阶，有的时候一次爬三个台阶
        //如果台阶有20个台阶，有多少种爬法？

        System.out.println(getCount(20));//121415
    }
    public static int getCount(int t){
        //递归结束条件
        if(t == 1){
            return 1;
        }
        if(t == 2){
            return 2;
        }
        if(t == 3){
            return 4;
        }
        return getCount(t - 1) + getCount(t - 2) + getCount(t - 3);
    }
}
