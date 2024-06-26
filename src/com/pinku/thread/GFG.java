package com.pinku.thread;

public class GFG {
	 
	static int N;
	int counter = 1;
	
	public void printEvenNumber() {
		synchronized (this) {
			while(counter < N) {
				while(counter % 2 == 1) {
					
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				
				System.out.print(counter+" ");
				counter++;
				notify();
			}
		}
	}
	
	public void printOddNumber() {
		synchronized (this) {
				while(counter < N) {
					while(counter % 2 == 0) {
						try {
							wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
					System.out.print(counter+" ");
					counter++;
					notify();
				}
			
		}
	}
    // Driver Code
    public static void main(String[] args)
    {
        // Given Number 
        N = 100;
 
        // Create an object of class
        GFG mt = new GFG();
 
        // Create thread t1
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                mt.printEvenNumber();
            }
        });
 
        // Create thread t2
        Thread t2 = new Thread(new Runnable() {
            public void run()
            {
                mt.printOddNumber();
            }
        });
 
        // Start both threads
        t1.start();
        t2.start();
    }
}

