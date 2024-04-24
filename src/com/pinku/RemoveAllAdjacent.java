package com.pinku;

import java.util.Stack;

public class RemoveAllAdjacent {

	public static void main(String[] args) {
		
		String result = adjcent("abbaca");
		System.out.println(result);

	}

	private static String adjcent(String string) {
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for(Character ch : string.toCharArray()) {
			if(!stack.isEmpty() && stack.peek() == ch) {
				stack.pop();
			}else {
				stack.add(ch);
			}
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.reverse().toString();
	}

}
