package day07;

public class String_Practice01 {
    public static void main(String[] args) {
        //旋转调整字符串的内容并比较

        //创建两个字符串数组
        String str1 = "abcde";
        String str2 = "cdeab";
        //调用方法来比较
        boolean flag = check(str1,str2);
        if(flag){
            System.out.println("比较结束！经过多次旋转过后可以完全相同！");
        }else{
            System.out.println("比较结束！经过多次旋转过后不可以完全相同！");
        }
    }
    //创建方法，用来比较循环旋转多次后能不能一样
    public static boolean check(String str1,String str2){
        //循环比较，一样的话就返回true
        for(int i = 0; i < str1.length(); i++){
            str1 = rotate(str1);
            if(str1.equals(str2)){
                return true;
            }
        }
        //循环比较结束，还不一样的话就返回false
        return false;
    }
    //创建方法，用来旋转字符串数组
    public static String rotate(String str){
        //获取最左边的那个字符
        char first = str.charAt(0);
        //获取右边的剩余字符
        String end = str.substring(1);
        //返回拼接好的样子
        return  end + first;
    }
}
