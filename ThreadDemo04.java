package com.lcc.thread;

import com.sun.swing.internal.plaf.synth.resources.synth;

class ThDemo implements Runnable{
private int ticket=5;

	public void run() {
		// TODO �Զ����ɵķ������
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
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			
			System.out.println("��Ʊ"+":"+ticket--);
			}
	}
}

public class ThreadDemo04 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
ThDemo m=new ThDemo();
Thread t1=new Thread(m);
Thread t2=new Thread(m);
Thread t3=new Thread(m);
t1.start();
t2.start();
t3.start();
	}

}
