package com.pinku.internal;

import java.math.BigInteger;

public class Add {
	public static void main(String[] args) {
		
		
		String str1 = "7777555511111111";
		String str2 = "3332222221111";
		
		BigInteger b1 = new BigInteger(str1);
		BigInteger b2 = new BigInteger(str2);
		
		BigInteger sum = b1.add(b2);
		
		System.out.println(sum.toString());
	}
}
