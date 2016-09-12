package com.lcc.thread;

import com.sun.swing.internal.plaf.synth.resources.synth;

class ThDemo implements Runnable{
private int ticket=5;

	public void run() {
		// TODO 自动生成的方法存根
		for (int i = 0; i <10; i++) {
			//synchronized (this) {
			tell();
			}
			
		}
	
	public synchronized void tell(){
		if(ticket>0){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
			System.out.println("车票"+":"+ticket--);
			}
	}
}

public class ThreadDemo04 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
ThDemo m=new ThDemo();
Thread t1=new Thread(m);
Thread t2=new Thread(m);
Thread t3=new Thread(m);
t1.start();
t2.start();
t3.start();
	}

}
