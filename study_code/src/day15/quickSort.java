package day15;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        /*
                快速排序：
                第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
                比基准数小的全部在左边，比基准数大的全部在右边。
                后面以此类推。
        */
        //1. 从数列中挑出一个元素，一般都是左边第一个数字，称为 "基准数"
        //2. 创建两个指针，一个从前往后走，一个从后往前走
        //3. 先执行后面的指针，找出第一个比基准数小的数字
        //4. 再执行前面的指针，找出第一个比基准数大的数字
        //5. 交换两个指针指向的数字
        //6. 直到两个指针相遇
        //7. 将基准数跟指针指向位置的数字交换位置，称之为：基准数归位
        //8. 第一轮结束之后，基准数左边的数字都是比基准数小的，基准数右边的数字都是比基准数大的
        //9. 把基准数左边看做一个序列，把基准数右边看做一个序列，按照刚刚的规则递归排序

        int[] arr = {1, 1, 6, 2, 7, 9, 3, 4, 5, 1, 10, 8};
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    /*
     *   参数一：我们要排序的数组
     *   参数二：要排序数组的起始索引
     *   参数三：要排序数组的结束索引
     */
    public static void quickSort(int[] arr,int i,int j){
        //定义两个变量记录要查找的范围
        int start = i;
        int end = j;
        //递归结束条件
        if(start > end){
            return;
        }
        int baseNumber = arr[i];
        while(start != end){
            //先执行后面的指针（先执行前面的会出错）
            while(true){
                //第一个比基准数小的数字找出来了
                if(end <= start || arr[end] < baseNumber){
                    break;
                }
                //倒着走的，没找出来继续找下一个
                end--;
            }
            while(true){
                //第一个比基准数大的数字找出来了
                if(end <= start || arr[start] > baseNumber){
                    break;
                }
                //正着走的，没找出来继续找下一个
                start++;
            }
            //交换两个指针指向的数字
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //当start和end指向了同一个元素的时候，那么上面的循环就会结束
        //表示已经找到了基准数在数组中应存入的位置
        //基准数归位
        //就是拿着这个范围中的第一个数字，跟start指向的元素进行交换
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
        //递归排序左右两边的
        //确定6左边的范围，重复刚刚所做的事情
        quickSort(arr,i,start - 1);
        //确定6右边的范围，重复刚刚所做的事情
        quickSort(arr,start + 1,j);
    }
}
