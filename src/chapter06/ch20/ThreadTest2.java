package chapter06.ch20;
class MyThread2 implements Runnable{
    public void run(){
        int i;
        for(i = 1; i <= 200; i++){
            System.out.print(i + "\t");
        }
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread()+" start");

        MyThread2 mth1 = new MyThread2();
        MyThread2 mth2 = new MyThread2();

        Thread th1 = new Thread(mth1);
        Thread th2 = new Thread(mth2);

        th1.start();
        th2.start();

        System.out.println(Thread.currentThread()+" end");

        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }
        };
        run.run();
    }
}
