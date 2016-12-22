package com.hill.thread_demo;



class MyThread extends Thread{
    // 一共有5张火车票
    private int ticketsCont = 5;
    private String name;

    public MyThread(String name){
        this.name = name;
    }

    @Override
    public void run(){
        while(ticketsCont > 0){
            //如果还有票，就卖掉一张
            ticketsCont--;
            System.out.println(name + "买了1张票，剩余票数为：" + ticketsCont);
        }
    }

}


/**
 * Created by Coing on 2016/12/21.
 */
public class TicketsThread {
    /**
     *
     * @param agrs
     */
    public static void main(String[] agrs) throws InterruptedException {
        // 创建三个线程，模拟三个窗口买票
        MyThread mt1 = new MyThread("窗口1");
        MyThread mt2 = new MyThread("窗口2");
        MyThread mt3 = new MyThread("窗口3");

        // 启动这三个线程，也即是窗口，开始买票
        mt1.start();
        mt2.start();
        mt3.start();

        //mt1.join();
        System.out.println("end of program");
    }
}
