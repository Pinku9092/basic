package com.pinku.thread;

public class SumOfInteger implements Runnable{
	 volatile int sum = 0;
	
	@Override
	public void run() {
		System.out.println(sum);
		
	}

}
