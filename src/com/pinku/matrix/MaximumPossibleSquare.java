package com.pinku.matrix;

public class MaximumPossibleSquare {
	
	public static void main(String[] args) {
		int[][] matrix = {
				{0,1,0,0,0},
				{0,1,1,1,0},
				{1,1,1,1,0},
				{0,1,1,1,0},
				{1,0,0,0,1}
		};
		System.out.println(possibleMatrix(matrix));
		
		System.out.println(optimalMax());
	}

	private static int optimalMax() {
		int[][] grid = {
				{0,1,0,0,0},
				{0,1,5,1,0},
				{1,1,1,1,0},
				{0,1,1,1,4},
				{1,0,0,0,1}
		};
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				//System.out.print(cache[i][j]+" ");
				if(i == 0 || j == 0) {
					continue;
				}else if(grid[i][j] > 0) {
					grid[i][j] = grid[i][j] + Math.max(grid[i][j-1], Math.max(grid[i-1][j], grid[i-1][j-1]));
				}
				
			}
			//System.out.println();
		}
		
		
		return grid[grid.length-1][grid[0].length-1];
	}

	private static int possibleMatrix(int[][] matrix) {
		int[][] cache = matrix;
		int result = Integer.MIN_VALUE;
		for(int i = 0; i < cache.length; i++) {
			for(int j = 0; j < cache[0].length; j++) {
				//System.out.print(cache[i][j]+" ");
				if(i == 0 || j == 0) {
					continue;
				}else if(matrix[i][j] > 0) {
					cache[i][j] = 1 + Math.min(cache[i][j-1], Math.min(cache[i-1][j], cache[i-1][j-1]));
				}
				if(cache[i][j] > result) {
					result = cache[i][j];
				}
			}
			System.out.println();
		}
		return result;
	}

}
