package com.pinku;

public class BinaryToDecimal {
	//Integer.parseInt(binaryNum,2);
	public static void main(String[] args) {
		long num = 01111;
		int decimal = convertBinaryToDecimal(num);
		System.out.println(decimal);
	}

	private static int convertBinaryToDecimal(long num) {
		int reminder;
		int decimal = 0, i = 0;
		
		while(num != 0) {
			reminder = (int) (num % 10);
			decimal += reminder * Math.pow(2, i);
			num /= 10;
			i++;
		}
		return decimal;
	}

}
