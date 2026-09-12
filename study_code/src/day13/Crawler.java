package day13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawler {
    public static void main(String[] args) {
        //定义要爬取的整个文本段
        String s = "Java自从95年问世以来，abbbbbbbbbbbbbbbbbbbbbbbbbb" +
                "经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //定义正则表达式
        String regex1 = "(Java)(?=8|11|17)";
        String regex2 = "(Java)(8|11|17)";
        String regex3 = "ab+";//非贪婪：ab+?

        //爬取
        Pattern p = Pattern.compile(regex3);
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        //替换
        String result1 = s.replaceAll(regex1,"Python");
        System.out.println(result1);

        System.out.println("-----------------------------------------------------------------------------------------");

        //切割
        String[] arr  = s.split("(Java)(?=8|11|17)");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
