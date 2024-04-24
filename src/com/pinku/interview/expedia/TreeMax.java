package com.pinku.interview.expedia;

import java.util.LinkedList;
import java.util.Queue;

public class TreeMax {
	
	public static void main(String[] args) {
		
		Tree root = new Tree(4);
		/*
		 * root.left = new Tree(9); root.right = new Tree(2); root.left.left = new
		 * Tree(3); root.left.right = new Tree(5); root.right.right = new Tree(7);
		 */
		
		
		max(root);
	}

	private static void max(Tree root) {
	
		Queue<Tree> queue = new LinkedList<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			int size = queue.size();
			
			int max = Integer.MIN_VALUE;
			
			for(int i = 0; i < size; i++) {
				
				Tree current = queue.poll();
				
				if(max < current.data) {
					max = current.data;
				}
				if(current.left != null) {
					queue.add(current.left);
				}
				
				if(current.right != null) {
					queue.add(current.right);
				}
			}
			
			System.out.println(max);
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}

}

class Tree{
	
	int data;
	Tree left,right;
	Tree(int data){
		this.data = data;
		left = null;
		right = null;
	}
}
