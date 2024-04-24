package com.pinku;

public class DecimalToBinary {
	//Integer.toBinaryString(num);
	public static void main(String[] args) {
		int num = 15;
		
		long binary = decimalToBinary(num);
		
		System.out.println(binary);
	}

	private static long decimalToBinary(int num) {
		
		long binary = 0;
		int i = 0;
		int reminder;
		while(num != 0) {
			reminder = num%2;
			num /= 2;
			
			//binary += reminder * i;
			binary += reminder * Math.pow(10, i);
			//i *= 10;
			i++;
		}
		
		return binary;
	}

}
