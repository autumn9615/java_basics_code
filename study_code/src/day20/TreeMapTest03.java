package day20;

import java.util.TreeMap;

public class TreeMapTest03 {
    public static void main(String[] args) {
        //利用TreeMap进行统计 遍历

        //定义待统计字符串
        String s = "aababbcccdbdcbadbcdcdccc";

        //创建TreeMap集合
        TreeMap<Character, Integer> tm = new TreeMap<>();

        //遍历字符串得到里面的每一个字符，判断并统计起来
        for (int i = 0; i < s.length(); i++) {
            //拿着字符串数组里面的每一位去和TreeMap进行比较看是否存在
            if(tm.containsKey(s.charAt(i))){
                //如果存在，就把value拿出来加一再存回去
                int count = tm.get(s.charAt(i));
                //计数器统计
                count++;
                tm.put(s.charAt(i),count);
            }else{
                //如果不存在，就直接记下来这个元素（只出现了1次）
                tm.put(s.charAt(i),1);
            }
        }

        //遍历打印出来，按照格式拼接
        StringBuilder sb = new StringBuilder();
        tm.forEach((key, value) -> sb.append(key).append("(").append(value).append(")"));
        System.out.println(sb);
    }
}
