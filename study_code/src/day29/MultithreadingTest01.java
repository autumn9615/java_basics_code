package day29;

public class MultithreadingTest01 {
    public static void main(String[] args) {
//        多线程练习1（卖电影票）（学生自己练习）
//        一共有1000张电影票，可以在两个窗口领取，假设每次领取的时间为3000毫秒，
//        要求：请用多线程模拟卖票过程并打印剩余电影票的数量


        MyThread01 t1 = new MyThread01();
        MyThread01 t2 = new MyThread01();
        MyThread01 t3 = new MyThread01();

        t1.setName("窗口1：");
        t2.setName("窗口2：");
        t3.setName("窗口3：");

        t1.start();
        t2.start();
        t3.start();
    }
    static class MyThread01 extends Thread{
        // 表示电影票
        static int ticket = 0;
        // 锁对象，一定要是唯一的
        static Object lock = new Object();
        @Override
        public void run() {
            while(true){
                // 进来的只有一个，锁来把关
                synchronized (lock){
                    if(ticket < 100) {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        ticket++;
                        System.out.println(getName() + "正在卖第" + ticket + "张票！！");
                    }else{
                        break;
                    }
                }
            }
        }
    }
}
