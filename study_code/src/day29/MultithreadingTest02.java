package day29;

public class MultithreadingTest02 {
    public static void main(String[] args) {
//        多线程练习2（送礼品）（学生自己练习）
//        有100份礼品，两人同时发送，当剩下的礼品小于10份的时候则不再送出。
//        利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来。

        MyThread02 t1 = new MyThread02();
        MyThread02 t2 = new MyThread02();

        t1.setName("学生1：");
        t2.setName("学生2：");

        t1.start();
        t2.start();
    }
    static class MyThread02 extends Thread{
        // 表示礼品
        static int gift = 0;
        // 锁对象，一定要是唯一的
        static Object lock = new Object();
        @Override
        public void run() {
            while(true){
                // 进来的只有一个，锁来把关
                synchronized (lock){
                    if(gift < 90) {
                        gift++;
                        System.out.println(getName() + "正在送第" + gift + "份礼品！！");
                    }
                }if(gift >= 90){
                    System.out.println("剩下" + (100-gift) + "份礼品！！不再送出！！");
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
