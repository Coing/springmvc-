package com.hill.runnable_demo;

/*
窗口1买了1张票，剩余票数为：3
窗口3买了1张票，剩余票数为：2
窗口2买了1张票，剩余票数为：2
窗口3买了1张票，剩余票数为：0
窗口1买了1张票，剩余票数为：1
*/
class MyThread implements Runnable{
    // 一共有5张火车票
    private int ticketsCont = 5;

    @Override
    public void run(){
        while(ticketsCont > 0){
            //如果还有票，就卖掉一张
            ticketsCont--;
            System.out.println(Thread.currentThread().getName() + "买了1张票，剩余票数为：" + ticketsCont);
        }
    }
}

/**
 * Created by Coing on 2016/12/21.
 */
public class TicketsRunnable {

    public static void main(String[] agrs) throws InterruptedException {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();
        // 创建三个线程来模拟三个售票窗口
        Thread th1 = new Thread(mt1, "窗口1");
        Thread th2 = new Thread(mt2, "窗口2");
        Thread th3 = new Thread(mt3, "窗口3");

        th1.start();
        th2.start();
        th3.start();

        th1.join();
        th2.join();
        th3.join();
        System.out.println("end of program");
    }
}
