package com.lcc.thread;

class Deadlock implements Runnable
{
	boolean b=true;
	
private int ticket=100;
	Object obj=new Object();
	public void run() 
	{
		
	while(b)
	{ 
		synchronized (this) 
		{
			if(ticket>0){
		try {
		Thread.sleep(10);
	} catch (InterruptedException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
		System.out.println(Thread.currentThread().getName()+". . . "+ticket--);
	    }
		}
	}
	while(!b)
	{
		show();
	 
		 
	 }
		
	}
	public synchronized void show()
	{
		if(ticket>0){
			try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
			System.out.println(Thread.currentThread().getName()+". . . "+ticket--);
		    }
	}
	
	
	}
    
	


public class DeadlockDemo01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Deadlock t=new Deadlock();
	  Thread t1=new Thread(t);
	  Thread t2=new Thread(t);
	  //Thread t3=new Thread(t);
		t1.start();
		t.b=false;
		t2.start();
		//t3.start();
		
	}

}
