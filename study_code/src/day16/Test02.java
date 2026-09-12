package day16;

public class Test02 {
    public static void main(String[] args) {
        //猴子吃桃子问题
        //有一堆桃子，猴子第一天吃了其中的一半，并且多吃了一个，以后每天猴子都吃当前剩下的一半，
        //然后再多吃一个，第十天的时候（还没吃），发现只剩下一个桃子了，请问最初总共多少个桃子？

        //分析：递归解决，从第十天倒着往回算，依次加上去
        //第十天：1 第九天：第十天+1*2（4） 第八天：第九天+1*2（10）
        //1 4 10 22 46

        System.out.println(monkeyEat(10));//1534
    }
    public static int monkeyEat(int number){
        //递归终止条件：算到第一天
        if(number == 1){
            return 1;
        }
        return (monkeyEat(number - 1) + 1) * 2;
    }
}
