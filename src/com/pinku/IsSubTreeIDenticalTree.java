package com.pinku;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IsSubTreeIDenticalTree {

	public static void main(String[] args) {

		TreeNode obj = new TreeNode(5);
		obj.left = new TreeNode(2);
		obj.right = new TreeNode(6);

		TreeNode obj2 = new TreeNode(5);
		obj2.left = new TreeNode(2);
		obj2.right = new TreeNode(6);
		
		System.out.println(isSubTree(obj, obj2));
		
		
		System.out.println("Level Order Started");
		List<Double> result = averageOfLevels(obj);
		
		result.stream().forEach(System.out::println);
		

	}

	private static List<Double> averageOfLevels(TreeNode root){
		
		List<Double> result = new ArrayList<>();
		if(root == null) {
		return result;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int height = 0;
		while(!queue.isEmpty()) {
			double level_sum = 0;
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				TreeNode current_node = queue.poll();
				level_sum += current_node.val;
				if(current_node.left != null) {
					queue.offer(current_node.left);
				}
				if(current_node.right != null) {
					queue.offer(current_node.right);
				}
			}
			result.add(level_sum/size);
			height++;
		}
		System.out.println("Total height of binary tree is : "+height);
		return result;
	}
	private static boolean isSubTree(TreeNode root, TreeNode subRoot) {
		
		if(root == null) {
			return false;
		}
		
		if(root.val == subRoot.val) {
			if(isIdentical(root, subRoot)) {
				return true;
			}
		}
		
		return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
	}


	private static boolean isIdentical(TreeNode root, TreeNode subRoot) {
		
		if(root == null && subRoot == null) {
			return true;
		}
		else if(root == null || subRoot == null || root.val != subRoot.val) {
			return false;
		}
		
		if(!isIdentical(root.left, subRoot.left)) {
			return false;
		}
		
		if(!isIdentical(root.right, subRoot.right)) {
			return false;
		}
		return true;
	}
	
	
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
