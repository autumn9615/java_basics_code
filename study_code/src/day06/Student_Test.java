package day06;

public class Student_Test {
    public static void main(String[] args) {
        //创建一个数组用来存储学生对象
        Student[] arr = new Student[3];
        //创建学生对象并添加到数组中
        Student stu1 = new Student(1,"张三",21);
        Student stu2 = new Student(2,"李四",20);
        Student stu3 = new Student(3,"王五",22);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        //再添加一个新的学生对象(添加的时候要判断学号)
        Student stu4 = new Student(4,"赵六",25);
        //判断学号
        boolean flag = contains(arr,stu4.getId());
        if(flag){
            System.out.println("该学号已存在！请修改后再重新添加！");
        }else {
            int count = getArrCount(arr);
            //判断数组情况
            if (count == arr.length) {
                //数组已经存满
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                printArr(newArr);
                System.out.println("===================================");
                //删除对应的元素
                int index1 = getIndex(newArr,stu2.getId());
                if(index1 >= 0){
                    newArr[index1] = null;
                }else{
                    System.out.println("该学号不存在！请修改后再重新删除！");
                }
                printArr(newArr);
                System.out.println("===================================");
                //修改选中元素的年龄
                int index3 = getIndex(newArr,stu3.getId());
                if(index3 >= 0){
                    //创建一个变量拿来存选中的元素
                    Student Stu1 = arr[index3];
                    //修改当前元素的年龄（+1）
                    int newAge = Stu1.getAge() + 1;
                    //修改之后的年龄塞回去
                    Stu1.setAge(newAge);
                    //遍历数组
                    printArr(newArr);
                }else{
                    System.out.println("该学号不存在！请修改后再重新修改！");
                }
            } else {
                //数组还未存满
                arr[count] = stu4;
                printArr(arr);
                System.out.println("===================================");
                //删除对应的元素
                int index2 = getIndex(arr,stu2.getId());
                if(index2 >= 0){
                    arr[index2] = null;
                }else {
                    System.out.println("该学号不存在！请修改后再重新删除！");
                }
                printArr(arr);
                System.out.println("===================================");
                //修改选中元素的年龄
                int index4 = getIndex(arr,stu3.getId());
                if(index4 >= 0){
                    //创建一个变量拿来存选中的元素
                    Student Stu2 = arr[index4];
                    //修改当前元素的年龄（+1）
                    int newAge = Stu2.getAge() + 1;
                    //修改之后的年龄塞回去
                    Stu2.setAge(newAge);
                    //遍历数组
                    printArr(arr);
                }else{
                    System.out.println("该学号不存在！请修改后再重新修改！");
                }
            }
        }
    }
    //创建方法，用来获取要删除的那个元素的索引
    public static int getIndex(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            //依次获取数组中的每一个元素
            Student stu = arr[i];
            //非空判断
            if(stu != null){
                //获取这个元素的id
                int stu_id = stu.getId();
                //比较判断
                if(stu_id == id){
                    return i;
                }
            }
        }
        //循环结束后没找到一样的，就表明这个id不存在
        return -1;
    }
    //创建方法，用来打印数组里面的每个元素
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            //定义一个变量存每次遍历的元素
            Student stu = arr[i];
            if(stu != null){
                System.out.println("学号为：" + stu.getId() + "， " + "姓名为：" + stu.getName() + "， " + "年龄为：" + stu.getAge());
            }
        }
    }
    //创建方法，用来创建一个新数组（返回值是数组）
    public static Student[] creatNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length + 1];
        //将老数组中的元素存到新数组
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    //创建方法，判断数组中已经存了几个元素
    public static int getArrCount(Student[] arr){
        //定义一个计数器统计
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }
    //创建方法，来判断数组中有没有这个id
    public static boolean contains(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            //依次获取数组中的每一个元素
            Student stu = arr[i];
            //非空判断
            if(stu != null){
                //获取这个元素的id
                int stu_id = stu.getId();
                //比较判断
                if(stu_id == id){
                    return true;
                }
            }
        }
        //循环结束后没找到一样的，就表明这个id不存在
        return false;
    }
}