package com.pinku;

public class ReshapeMatrix {
	public static void main(String[] args) {
		
		int[][] mat = {
				{1,2},
				{3,4}
		};
		int[][] result = matrixReshape(mat, 4, 1);
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	
	private static int[][] matrixReshape(int[][] mat, int r, int c){
		
		int rows = mat.length;
		int cols = mat[0].length;
		
		if(rows*cols != r*c) {
			return mat;
		}
		
		int[][] output = new int[r][c];
		int rows_num = 0;
		int cols_num = 0;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				output[rows_num][cols_num] = mat[i][j];
				cols_num++;
				if(cols_num == c) {
					cols_num = 0;
					rows_num++;
				}
			}
		}
		
		return output;
	}

}
