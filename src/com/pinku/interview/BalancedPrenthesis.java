package com.pinku.interview;

import java.util.Stack;

public class BalancedPrenthesis {
	
	public static void main(String[] args) {
		String str = "({[]})";
		
		boolean flag = isValidBrackets(str);
		if(flag) {
			System.out.println("Given String is balanced");
		}else {
			System.out.println("Given String is not balanced");
		}
		
	}

	private static boolean isValidBrackets(String str) {
		
		Stack<Character> stack  = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == '(' || ch == '[' || ch == '{') {
			stack.push(ch);
			}else if(!stack.isEmpty() && ch == ')' && stack.peek() == '(') {
				stack.pop();
			}else if(!stack.isEmpty() && ch == ']' && stack.peek() == '[') {
				stack.pop();
			}else if(!stack.isEmpty() && ch == '}' && stack.peek() == '{') {
				stack.pop();
			}else {
				return false;
			}
		}
		
		
		return stack.isEmpty();
	}

}
