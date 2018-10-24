package com.test.thread;

public class ThreadTest01 {
    
	public static void main(String[] args) {
        Runner1 runner1 = new Runner1();
        Runner2 runner2 = new Runner2();
        // Thread(Runnable target) 分配新的 Thread 对象。
        Thread thread1 = new Thread(runner1);
        Thread thread2 = new Thread(runner2);
        thread1.start(); //执行start，thread1与thread2交叉执行
        thread2.start();
        //thread1.run(); //执行run，thread1与thread2顺序执行
        //thread2.run();
    }
}

class Runner1 implements Runnable { // 实现了Runnable接口，jdk就知道这个类是一个线程
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("进入Runner1运行状态——————————" + i);
        }
    }
}

class Runner2 implements Runnable { // 实现了Runnable接口，jdk就知道这个类是一个线程
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("进入Runner2运行状态==========" + i);
        }
    }
}