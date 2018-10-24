package com.test.thread;

/**
 * 
 * @author WANGCONG
 * 2018年10月24日下午1:38:42
 * @desc 竞态条件的简单实例
 */

//2个线程都会去访问静态变量index，他们获取系统时间片的时刻是不确定的，因此它们对index的访问和修改总是穿插进行的
public class RacingTest {
    public static void main(String[] args){
        new MyThread().start();
        new MyThread().start();
    }
}

class MyThread extends Thread{
	public static int index;
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(getName()+":"+index++);
        }
    }
}