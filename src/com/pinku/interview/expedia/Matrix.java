package com.pinku.interview.expedia;

public class Matrix {
	public static void main(String[] args) {
		//findElement();
	}

	private static int[] findElement(int[][] matrix,int x) {
		/*
		0, 1, 2, 4, 6, 8

		10, 15, 20, 25, 30,

		32, 35, 37, 38, 39,

		39, 40, 50, 60, 70

		80, 90, 95, 97, 100*/
		
		//n+log(m)
		int index = -1;
		for(int i = 0; i < matrix.length; i++) {
			
			if(matrix[i][0] > x) {
				index = i-1;
				break;
			}
		}
		int colIndex = -1;
		for(int i = 0; i < matrix[index].length; i++) {
			
			if(matrix[index][i] == x) {
				colIndex = i;
				break;
			}
		}
		
		return new int[] {index,colIndex};
		
	}
}
