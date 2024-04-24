package com.pinku.internal;

import java.util.Stack;

public class Pre {
	
	public static void main(String[] args) {
		String str = "{[()]}";
		
		boolean flag = valid(str);
		if(flag) {
			System.out.println("Valid");
		}else {
			System.out.println("Not Valid");
		}
	}

	private static boolean valid(String str) {
		
		Stack<Character> stack = new Stack<>();
		
		for(char ch : str.toCharArray()) {
			
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}else if(!stack.isEmpty() && stack.peek() == '(' && ch == ')') {
				stack.pop();
			}else if(!stack.isEmpty() && stack.peek() == '{' && ch == '}') {
				stack.pop();
			}else if(!stack.isEmpty() && stack.peek() == '[' && ch == ']') {
				stack.pop();
			}else {
				return false;
			}
		}
		
		return stack.isEmpty();
	}
}
