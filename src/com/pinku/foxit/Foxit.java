package com.pinku.foxit;
import java.util.*;
public class Foxit {

	public static void main(String[] args) {
		String str = "";
		
		boolean flag = valid(str);
		
		if(flag) {
			System.out.println("Valid");
		}else {
			System.out.println(" Not Valid");
		}
	}

	private static boolean valid(String str) {
		if(str == null || str == "") {
			return false;
		}
		Stack<Character> stack = new Stack<>();
		
		for(char ch : str.toCharArray()) {
			
			if(ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			}else if(ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			}else if(ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			}else if(ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			}else {
				return false;
			}
		}
		return stack.isEmpty();
	}
}
