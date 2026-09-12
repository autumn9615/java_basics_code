package day14;

public class Test02 {
    public static void main(String[] args) {
        //自己写代码实现十进制转化为二进制
        //核心逻辑：不断的除以二，一直到商为零就结束
        //最后把余数倒着拼接起来

        int number = 20;
        System.out.println("自己做出来的：" + toBinaryString(number));
        System.out.println("Java自带的：" + Integer.toBinaryString(number));
    }

    private static String toBinaryString(int number) {
        //定义一个StringBuilder用来拼接余数
        StringBuilder sb = new StringBuilder();
        while(true){
            if(number == 0){
                break;
            }
            //获取余数
            int yushu = number % 2;
            //倒着拼接
            sb.insert(0, yushu);
            number /= 2;
        }
        return sb.toString();
    }
}
