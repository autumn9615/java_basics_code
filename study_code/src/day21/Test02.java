package day21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        // 练习二：
        // 随机抽取男生女生，保证男生概率是70%，女生概率是30%

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,1,1,1,1,1,1,0,0,0);

        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Random rand = new Random();
        Collections.addAll(boyList, "李强","张伟","王浩宇","刘洋","赵天乐","吴迪");
        Collections.addAll(girlList, "欧阳明月","陈思琪","孙雪", "周嘉懿");
        if(list.get(rand.nextInt(0,list.size())) == 1){
            // 男生
            System.out.println("男生:" + boyList.get((rand.nextInt(0,boyList.size()))));
        }else{
            // 女生
            System.out.println("女生:" + girlList.get((rand.nextInt(0,girlList.size()))));
        }
    }
}
