package day15;

public class blockSearch {
    public static void main(String[] args) {
        //分块查找
        //1. 需要把数据分成N多小块，块与块之间不能有数据重复的交集。
        //2. 给每一块创建对象单独存储到数组当中
        //3. 查找数据的时候，先在数组查，当前数据属于哪一块
        //4. 再到这一块中顺序查找

        //分块
        int[] arr = {27,22,30,40,36,
                     13,19,16,20,
                     7,10,
                     43,50,48};
        //要查找的值
        int number = 48;
        //定义各个块
        Block b1 = new Block(22,40,0,4);
        Block b2 = new Block(13,20,5,8);
        Block b3 = new Block(7,10,9,10);
        Block b4 = new Block(43,50,11,13);
        //拿一个数组来存这些
        Block[] blockArr = {b1,b2,b3,b4};
        //打印一下
        System.out.println("数字" + number + "的索引为：" + getIndex(blockArr,arr,number));

    }
    //利用分块查找的原理，查询number的索引
    public static int getIndex(Block[] blockArr, int[] arr, int number){
        //1.确定number是在那一块当中
        int blockIndex = findIndexBlock(blockArr,number);
        if(blockIndex == -1){
            //表示number不在数组当中
            return -1;
        }
        //2.获取这一块的起始索引和结束索引
        int startIndex = blockArr[blockIndex].getStartIndex();
        int endIndex = blockArr[blockIndex].getEndIndex();
        //3.遍历
        for (int i = startIndex; i <= endIndex; i++) {
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }
    //定义一个方法，用来确定number在哪一块当中
    public static int findIndexBlock(Block[] blockArr, int number){
        //从0索引开始遍历blockArr，如果number小于max，那么就表示number是在这一块当中的
        for (int i = 0; i < blockArr.length; i++) {
            if(number >= blockArr[i].min && number <= blockArr[i].max){
                return i;
            }
        }
        return -1;
    }
}
//定义分的块的类
class Block{
    int min;             //块中最小的数
    int max;             //块中最小的数
    int startIndex;      //块中起始的索引值
    int endIndex;        //块中结束的索引值
    public Block(){
    }
    public Block(int min,int max,int startIndex,int endIndex){
        this.min=min;
        this.max=max;
        this.startIndex=startIndex;
        this.endIndex=endIndex;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }
    public int getStartIndex() {
        return startIndex;
    }
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }
    public int getEndIndex() {
        return endIndex;
    }
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}