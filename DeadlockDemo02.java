package com.lcc.thread;

public class DeadlockDemo02 implements Runnable
	{
		Object locka=new Object();
		 Object lockb=new Object();
		private boolean flag;
		DeadlockDemo02(boolean flag)
		{
			this.flag=flag;
		}
		public void run()
		{if(flag)
		{
			while(true)
			{
			synchronized (locka)
			{
				System.out.println("if locka");
				
				synchronized (lockb) 
				{
					System.out.println("if lockb");
				}
			}
			}
		}
		else
		{while(true)
		{
			synchronized (lockb) 
			
			{System.out.println("else lockb");
				synchronized (locka) 
				{
					System.out.println("else locka");
				}
			}
		}
		}
			
		}
		
	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Thread t1=new Thread(new DeadlockDemo02(true));
Thread t2=new Thread(new DeadlockDemo02(false));
t1.start();
t2.start();
	}
	}

