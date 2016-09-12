package com.lcc.thread;

class ThRun implements Runnable{
	
	
	public void run() {
	for (int i = 0; i < 5; i++) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" :"+i);
		
	}
		
	}
}

public class ThreadMemo04 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Thread t1=new Thread(new ThRun(),"A");
Thread t2=new Thread(new ThRun(),"B");
Thread t3=new Thread(new ThRun(),"C");
t1.setPriority(Thread.MIN_PRIORITY);
t2.setPriority(Thread.NORM_PRIORITY);
t3.setPriority(Thread.MAX_PRIORITY);
t1.start();
t2.start();
t3.start();
	}

}
