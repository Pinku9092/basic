package com.pinku;

public class QuickSort {

	public static void main(String[] args) {
		int ar[] = {10,4,6,2,1,8};
		
		
		quickSort(ar, 0, ar.length-1);
		
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

	private static void quickSort(int[] ar, int low, int high) {

		if (low > high) {
			return;
		}

		int mid = low + (high - low) / 2;

		int pivot = ar[mid];

		int i = low;
		int j = high;
		while (i <= j) {
			while (ar[i] < pivot) {
				i++;
			}
			while (ar[j] > pivot) {
				j--;
			}
			if( i <= j) {
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
				i++;
				j--;
			}
		}
		if(low < j) {
			quickSort(ar, low, j);
		}
		if(high >i) {
			quickSort(ar, i, high);
		}
	}

}
