package com.pinku.interview;

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
	
	Queue<Integer> pushStack = new LinkedList<>();
	
	
	public void push(int n) {
		
		pushStack.add(n);
		int size = pushStack.size();
		for(int i = 0; i < size-1; i++) {
			int element = pushStack.remove();
			pushStack.add(element);
		}


		/*pushStack.add(n);
		int size = pushStack.size();
		for(int i = 0; i < size-1; i++){
			int ele = pushStack.remove();
			pushStack.add(ele);
		}*/
		
	}
	
	
	
	public int pop() {
		
		return pushStack.remove();
	}
	
	public int peek() {
		
		return pushStack.peek();
		
	}
	
	public boolean empty() {
		return pushStack.isEmpty();
	}
	
}
