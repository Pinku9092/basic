package com.pinku;

public class SumOfNaturalNumber {
	public static int sum = 1;
	public static void main(String[] args) {
		
		sumOfNaturalNumber(5);
		System.out.println(sum);
		sum = 0;
		int result = sumOfNaturalNumber2(5);
		
		System.out.println();
		System.out.println(result);
		System.out.println(fact(5));
		
	}

	private static void sumOfNaturalNumber(int num) {
		if(num > 1) {
			sum += num;
			num--;
			sumOfNaturalNumber(num);
		}
	}
	
	private static int sumOfNaturalNumber2(int num) {
		
		if(num == 0) {
			return sum;
		}
		sum += num;
		num--;
		sumOfNaturalNumber2(num);
		return sum;
	}
	
	private static int fact(int num) {
		if(num == 0) {
			return 1;
		}else {
			return num*fact(num-1);
		}
	}
}
