package com.pinku.interview.expedia;

import java.util.Arrays;

public class Expedia_Dec13_ReplaceWith20 {
// Hello world
	//Hello%20world
	//char[] charArray = {H,e,l,l,o};
	public static void main(String[] args) {
		char[] charArray = {'H','e','l','l',' ','w','o','r','l','d',' ',' '};
		replaceWith20(charArray);
		System.out.println(Arrays.toString(charArray));
	}

private static void replaceWith20(char[] charArray) {
	// TODO Auto-generated method stub
	
	int n = charArray.length;
	int j = n - 1;
	boolean flag = true;
	for(int i = n-1; i >= 0; i--) {
		
		char ch = charArray[i];
		if(ch == ' ' && flag) {
			continue;
		}else {
			flag = false;
		}
		if(ch != ' ') {
			charArray[j] = ch;
			j--;
		}else {
			charArray[j--] = '0';
			charArray[j--] = '2';
			charArray[j--] = '%';
			break;
		}
	}
}

	
}
