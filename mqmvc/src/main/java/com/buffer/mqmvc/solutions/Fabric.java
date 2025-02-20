package com.buffer.mqmvc.solutions;

public class Fabric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //protected Thread t = new Thread(new Fabric());
     //Thread t2= new Thread(new Fabric());
     //t.start();
     //t2.start();
	}
	public void run() {
		for(int i=0; i<2;i++) {
			System.out.println(Thread.currentThread().getName()+" ");
		}
	}

}
