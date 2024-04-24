package com.pinku.interview;

//Maximum sum path in a matrix from top-left to bottom-right
public class OptimalSolutionGS {
	
	public static void main(String[] args) {
		int [][]grid = {{1, 2}, 
						{3, 5}};
		  System.out.print(MaximumPath(grid));
		  
		  System.out.println(minPath(grid));
	}

	private static int minPath(int[][] grid) {
		
		int rows = grid.length-1;
		int cols = grid[0].length-1;
		
		int[][] dp = new int[rows+1][cols+1];
		
		for(int i = rows; i >= 0; i--) {
			for(int j = cols; j >= 0; j--) {
				if(i == rows && j != cols) {
					dp[i][j] = grid[i][j] + dp[i][j+1];
				}else if(i != rows && j == cols) {
					dp[i][j] = grid[i][j] + dp[i+1][j];
				}else if(i != rows && j != cols) {
					dp[i][j] = grid[i][j] + Math.max(dp[i][j+1], dp[i+1][j]);
				}else {
					dp[i][j] = grid[i][j];
				}
			}
		}
		
		return dp[0][0];
	}

	private static int MaximumPath(int[][] grid) {
		
		int N = grid.length;
		int M = grid[0].length;
		
		
		int[][] sum = new int[N+1][M+1];
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= M; j++) {
				sum[i][j] = Math.max(sum[i-1][j], sum[i][j-1]+grid[i-1][j-1]);
			}
		}
		return sum[N][M];
	}

}
