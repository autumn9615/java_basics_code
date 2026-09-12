package day15;

public class binarySearch {
    public static void main(String[] args) {
        //二分查找
        //要查找的数据比中间节点小：说明要查找的数字在中间节点的左半边
        //要查找的数据比中间节点大：说明要查找的数字在中间节点的右半边

        int[] arr = {1,12,25,31,47,52,68,79,83,92};
        int number = 68;
        System.out.println(basicSearch(arr,number));
    }
    //定义一个方法实现二分查找
    public static int basicSearch(int[] arr,int number){
        //定义两个指针记录最大和最小范围
        int min = 0;
        int max = arr.length-1;
        //循环不断的去找
        while(true){
            if(min > max){
                return -1;
            }
            //找到中间的mid的位置
            int mid = (min + max) / 2;
            //判断在哪个位置
            if(arr[mid] > number){
                //要查找的数据比中间节点小：说明要查找的数字在中间节点的左半边
                max = mid - 1;
            }else if(arr[mid] < number){
                //要查找的数据比中间节点大：说明要查找的数字在中间节点的右半边
                min = mid + 1;
            }else{
                return mid;
            }
        }
    }
}
