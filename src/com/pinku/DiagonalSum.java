package com.pinku;

public class DiagonalSum {
	
	public static void main(String[] args) {
		int[][] mat = {
				{1,1,1,},
				{1,1,1,},
				{1,1,1,}
		};
		
		int sum = diagonalSum(mat);
		System.out.println(sum);
	}

	private static int diagonalSum(int[][] mat) {
		int sum = 0;
		for(int i = 0; i < mat.length; i++) {
			sum = sum + mat[i][i];
			if(i != mat.length-i-1) {
				sum = sum + mat[i][mat.length-i-1];
			}
		}
		return sum;
	}

}
