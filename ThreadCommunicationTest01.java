/*package com.lcc.thread;


class Resourse
{
	boolean flag=false;
	private String name;
	private String sex;
	public synchronized void set(String name,String sex)
	{
		if(flag)
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
		this.name=name;
	    this.sex=sex;
	    flag=true;
		this.notify();
}
	public synchronized void get()
	{
		if(!flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		System.out.println(name+"   "+sex);
		flag=false;
		this.notify();
	}
}

class Input implements Runnable
{
   private Resourse r;
   Input(Resourse r)
   {
	   this.r=r;
   }
	public void run() {
		int x=0;
		while(true) {
			
		if(x==0)
		{
		r.set("张山"," 男");
	}
		else
		{
	    r.set("李蕾","女");
		}
		x=(x+1)%2;
		}
	
}
}

class Output implements Runnable
{
	private Resourse r;
	Output(Resourse r)
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
			
		






public class ThreadCommunicationTest01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Resourse r=new Resourse();
	new Thread(new Input(r)).start();
	new Thread(new Output(r)).start();
		
	}

}
*/
