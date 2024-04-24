package com.pinku.interview;

public class Print20 {
	
	static int N;
	static int counter = 1;
	
	public  void printEvenNumber() {
		synchronized (Print20.class) {
			while(counter <= N) {
				
				try {
					if(counter % 2 != 0) {
						wait();
					}
				}catch(InterruptedException e) {
					System.out.println("Exception"+ e.getMessage());
				}
				
				System.out.print(counter+"");
				counter++;
				notify();
			}
		}
	}
	
	
	public  void printOddNumber() {
		synchronized (Print20.class) {
			while(counter <= N) {
				
				try {
					if(counter % 2 == 0) {
						wait();
					}
				}catch(InterruptedException e) {
					System.out.println("Exception"+ e.getMessage());
				}
				
				System.out.print(counter+"");
				counter++;
				notify();
			}
		}
	}
	public static void main(String[] args) {
		N = 20;
		Print20 obj = new Print20();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				obj.printOddNumber();
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				obj.printEvenNumber();
			}
		});
		t1.start();
		t2.start();
	}
}
