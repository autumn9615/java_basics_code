package day29;

public class MultithreadingTest03 {
    public static void main(String[] args) {
//        多线程练习3（打印奇数数字）（学生自己练习）
//        同时开启两个线程，共同获取1-100之间的所有数字。
//        要求：将输出所有的奇数。

        MyThread03 t1 = new MyThread03();
        MyThread03 t2 = new MyThread03();

        t1.setName("学生1：");
        t2.setName("学生2：");

        t1.start();
        t2.start();
    }
    static class MyThread03 extends Thread{
        // 表示礼品
        static int num = 0;
        // 锁对象，一定要是唯一的
        static Object lock = new Object();
        @Override
        public void run() {
            while(num <= 100){
                // 进来的只有一个，锁来把关
                synchronized (lock){
                    if(num % 2 != 0) {
                        System.out.println(getName() + "出现奇数：" + num);
                    }
                }
                if(num + 1 != 100){
                    num++;
                }else{
                    num++;
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
