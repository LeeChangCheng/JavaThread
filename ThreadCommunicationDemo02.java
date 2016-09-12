/*package com.lcc.thread;


class Resourse
{ public int count=0;
	boolean flag=false;
	private String production;
	public synchronized void set(String production)
	{
		while(flag)
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
		this.production=production;
	    System.out.println(Thread.currentThread().getName()+"已生产"+(++count));
	    flag=true;
		this.notifyAll();
}
	public synchronized void get()
	{
		while(!flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		System.out.println(Thread.currentThread().getName()+"已消费"+"           "+count);
		flag=false;
		this.notifyAll();
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
public class ThreadCommunicationDemo02 {

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
*/
