package com.pinku.interview;
//{-7, 1, 5, 2, -10, 8, 0, 1} 
//left = -1
//right = -1
public class LeftIndex {
	
	public static void main(String[] args) {
		int[] ar = {2,3,2} ;
		String str = "aabbbccddaaabbccceefffffff";
		//a2b3c2d2a3b2c3e2f7
		//System.out.println(repeatedNumeric(str));
		System.out.println(findIndex(ar));
		
		//System.out.println(leftSum(ar));
	}

	private static int leftSum(int[] ar) {
		
		if(ar.length == 0) {
			return -1;
		}
		int i = 0;
		int j = ar.length-1;
		int left = 0 ;
		int right = 0;
		while(i < j) {
			left += ar[i++];
			right += ar[j--];
		}
		System.out.println(left);
		System.out.println(right);
		if(left == right) {
		return i;
		}
		return -1;
	}

	private static String repeatedNumeric(String str) {
		
		int count = 1;
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			if((i+1) < str.length())
			if(ch == str.charAt(i+1)) {
				count++;
			}else {
				//System.out.println(ch);
				result += (char)ch+""+count;
				count = 1;
			}
			
			
		}
		result += (char)str.charAt(str.length()-1)+""+count;
		return result;
		
		
		
	}

	private static int findIndex(int[] ar) {
		
		int leftSum = 0;
		int sum = 0;
		
		for(int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
	//	System.out.println(sum);
		int index = -1;
	//	int j = ar.length-1;
		for(int i = 0; i < ar.length; i++) {
			
			
			
				
				if((sum - ar[i]) == leftSum) {
					return i;
				}else {
					sum -= ar[i];
					leftSum += ar[i];
				}
				
				
			
		}
		
		return index;
	}

}
