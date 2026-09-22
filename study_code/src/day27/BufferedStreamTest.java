package day27;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeMap;

public class BufferedStreamTest {
    public static void main(String[] args) throws IOException {
        // 缓冲流练习：
        // 把《出师表》文章排序然后放到一个新文件中

        //1.创建TreeMap集合,泛型使用<Integer, String>
        TreeMap<Integer, String> map = new TreeMap<>();

        //2.创建BufferedReader对象,构造方法中传递FileReader对象
        BufferedReader br = new BufferedReader(new FileReader("study_code/src/day27/chushibiao-in.txt"));
        //3.创建BufferedWriter对象,构造方法中传递FileWriter对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("study_code/src/day27/chushibiao-out.txt"));

        String line;
        while((line = br.readLine()) != null){
            map.put(Integer.valueOf(line.split("\\.")[0]), line.split("\\.")[1]);
        }

        //4.创建ArrayList集合,泛型使用String
        ArrayList<String> list = new ArrayList<>();

        map.forEach((k,v)->{
            list.add(k+"."+v);
        });
        for(String s: list){
            bw.write(s);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
