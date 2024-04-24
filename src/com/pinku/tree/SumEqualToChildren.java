package com.pinku.tree;

public class SumEqualToChildren {
	public static void main(String[] args) {
		Node root = new Node(15);
		root.left = new Node(10);
		root.right = new Node(20);
		root.left.left = new Node(8);
		root.left.right = new Node(12);
		root.right.left = new Node(16);
	    root.right.right = new Node(25);
	    
	    if(sumEqualToChildren(root) != Integer.MIN_VALUE) {
	    	System.out.println("chidren sum equal");
	    }else {
	    	System.out.println("Not equal");
	    }
	}

	private static int sumEqualToChildren(Node root) {
		if(root == null) {
		return 0;
		}
		
		if(root.left == null && root.right == null) {
			return root.data;
		}
		
		int left = sumEqualToChildren(root.left);
		int right = sumEqualToChildren(root.right);
		
		
		if(left != Integer.MIN_VALUE && right != Integer.MIN_VALUE && root.data == left + right) {
			return root.data;
		}
		
		return Integer.MIN_VALUE;
	}
	
	
	
}
