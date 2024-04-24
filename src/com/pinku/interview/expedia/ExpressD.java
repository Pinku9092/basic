package com.pinku.interview.expedia;

public class ExpressD {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5};
	//3,1,2
	//8,9,1,3,5,7
	//int[] count = new 
	
	System.out.println(binary(arr, 0, arr.length-1, 2));
}

private static int binary(int[] arr, int i, int j, int num) {
	
	int low = i;
	int high = j;
	while(low <= high) {
	int mid = low + (high - low)/2;
	
	if(arr[mid] == num) {
		return mid;
	}else if(arr[mid] > num) {
		high = mid-1;
	}else {
		low = mid + 1;
	}
	}
	return -1;
}


}
