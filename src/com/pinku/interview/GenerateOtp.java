package com.pinku.interview;
import java.util.*;
public class GenerateOtp {
	public static void main(String[] args) {
		System.out.println(generateOtp(4));
	}

	private static char[] generateOtp(int length) {
		
		char[] chrs = new char[length];
		String str = "1234567890";
		Random random = new Random();
		for(int i = 0; i < length; i++) {
			chrs[i] = str.charAt(random.nextInt(str.length()));
		}

		/*for(int i = 0; i < length; i++){
			chrs[i] = str.charAt(random.nextInt(str.length()));
		}*/
		
		return chrs;
	}
}
