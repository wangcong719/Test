package com.test.thread;

/**
 * 
 * @author WANGCONG
 * 2018年10月24日下午2:18:44
 * @desc 规避竞态条件，使用同步
 * 在使用同步之后，线程会按照顺序访问静态变量，也就是说，同步机制通过“锁”解决了竞态条件
 */
public class SynchronizedTest {

	public static void main(String[] args){
        new MyThread02().start();
        new MyThread02().start();
    }
	
}

class MyThread02 extends Thread{
    public static int index;
    public static Object obj=new Object();
    public void run(){
    	synchronized(obj){
    		for(int i=0;i<10;i++){
    			System.out.println(getName()+":"+index++);
    		}
    	}
    }
}
