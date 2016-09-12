package com.lcc.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



class Resourse
{
	public int count=0;
	boolean flag=false;
	private String production;
	private Lock lock=new ReentrantLock();
	private Condition con_pro=lock.newCondition();
	private Condition con_con=lock.newCondition();
	public void set(String production)
	{
		lock.lock();
		
					try {
						while(flag)
						con_pro.await();
						this.production=production;
	    System.out.println(Thread.currentThread().getName()+"已生产"+(++count));
	    flag=true;
		con_con.signal();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
		finally
		{
			lock.unlock();
		}
}
	public void get()
	{lock.lock();
		
			try {
				while(!flag)
				con_con.await();
				System.out.println(Thread.currentThread().getName()+"已消费"+"           "+count);
		flag=false;
	
		con_pro.signal();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
					}
	finally
	{
		lock.unlock();
	}
	}
}

class Produce implements Runnable
{
   private Resourse r;
   Produce(Resourse r)
   {
	   this.r=r;
   }
	public void run() {
		while(true) {
			r.set("肥皂");
	}
	
}
}

class Comsume implements Runnable
{
	private Resourse r;
	Comsume(Resourse r)
	   {
		   this.r=r;
	   }
	public void run() 
	{
		while(true) {
		r.get();
		}
	}
}

	



public class ThreadCommunicationDemo03 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Resourse r=new Resourse();
		Produce p=new Produce(r);
		Comsume c=new Comsume(r);
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		Thread t3=new Thread(c);
		Thread t4=new Thread(c);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
