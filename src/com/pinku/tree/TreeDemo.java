package com.pinku.tree;

public class TreeDemo {

	public static void main(String[] args) {
		Node root = new Node(15);
		root.left = new Node(10);
		root.right = new Node(20);
		root.left.left = new Node(8);
		root.left.right = new Node(12);
		root.right.left = new Node(16);
	    root.right.right = new Node(25);
	}
	
}
