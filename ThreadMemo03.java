package com.lcc.thread;

class  RunnableDemo implements Runnable{
private String name;
 public RunnableDemo(String name) {
	 this.name=name;
}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for (int i = 0; i <50; i++) {
			
		System.out.println(name+":"+i);
		//	if(i==2){
				//System.out.println("����");
				//Thread.yield();
			}
		}
	}
	


public class ThreadMemo03 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
RunnableDemo r1=new RunnableDemo("A");
RunnableDemo r2=new RunnableDemo("B");
Thread t1=new Thread(r1);
Thread t2=new Thread(r2);
t1.start();
t1.yield();
t2.start();

	}

}
