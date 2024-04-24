package com.pinku;

public class Misslessnas {

	public static void main(String[] args) {
		
	System.out.println(findComplement(5));

	}

	private static int findComplement(int num) {
		int i = 0;
		int j = 0;
		while(i < num) {
			//i += Math.pow(2, j);
			i += powerOf2(j);
			j++;
		}
		
		return i-num;
	}
	private static int powerOf2(int j) {
		int p = 1;
		if(j == 0) {
			return p;
		}
		for(int i = 1; i <=j; i++) {
			p *= 2;
		}
		return p;
	}
}
