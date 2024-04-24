package com.pinku.tree;

import java.util.Stack;


/*
  															15
  															
  									10														20
  									
  					8							12								16						25
 
 */

public class IterativePostOrder {
	
	public static void main(String[] args) {
		Node root = new Node(15);
		root.left = new Node(10);
		root.right = new Node(20);
		root.left.left = new Node(8);
		root.left.right = new Node(12);
		root.right.left = new Node(16);
	    root.right.right = new Node(25);
	    
	    postTraval(root);
	}

	private static void postTraval(Node root) {
		
		Stack<Node> stack = new Stack<>();
		
		stack.push(root);
		
		while(!stack.isEmpty()) {
			
			Node curr = stack.peek();
			
			if(curr.left == null && curr.right == null) {
				Node node = stack.pop();
				System.out.printf("%d", node.data);
			}else {
				if(curr.right != null) {
					stack.push(curr.right);
					curr.right = null;
				}
				
				if(curr.left != null) {
					stack.push(curr.left);
					curr.left = null;
				}
			}
			
			
		}
		
		
		
		
	}

}
