package com.pinku.interview.ey;

import java.util.LinkedList;
import java.util.Queue;

public class ExpediaDemo {
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		System.out.println(
		stack.pop());
		System.out.println(
				stack.peek());
	}

}

class MyStack{
	
	Queue<Integer> queue = new LinkedList<>();
	
	
	public void push(int n) {
		
		queue.add(n);
		int size = queue.size();
		for(int i = 0; i < size-1; i++) {
			int element = queue.remove();
			queue.add(element);
		}
		
	}
	
	
	
	public int pop() {
		
		return queue.remove();
	}
	
	public int peek() {
		
		return queue.peek();
		
	}
	
	public boolean empty() {
		return queue.isEmpty();
	}
	
}
