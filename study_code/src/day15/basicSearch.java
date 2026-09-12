package day15;

import java.util.ArrayList;

public class basicSearch {
    public static void main(String[] args) {
        //基本查找
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：需要考虑数组中元素有重复的可能性，重复的索引都要返回（数组或集合）

        int[] arr = {1,24,8,2,39,16,24,4,57,0,24};
        System.out.println(basicSearch(arr,24));
    }
    //定义基本查找方法
    public static ArrayList<Integer> basicSearch(int[] arr, int number){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == number){
                list.add(i);
            }
        }
        //返回的是索引（0,1,2,3,4）
        return list;
    }
}
