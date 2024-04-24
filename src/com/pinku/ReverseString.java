package com.pinku;

public class ReverseString {
	
	 public static String rev = "";
     public static String str = "pinku";
    public static int len = str.length()-1;
    public static void main(String[] args) {
    reverse(len);
    System.out.println(rev);
    System.out.println();
    reverse(str);
    System.out.println();
    char[] charArray = str.toCharArray();
    reverse(charArray,0,str.length()-1);
    System.out.println(String.valueOf(charArray));
    }
    
    

	private static String reverse(int n){
        if(n < 0)
        return rev;
    else{
        rev = rev + str.charAt(n);
        n--;
        if(n >= 0)
        return reverse(n);
    }
    return rev;
}
private static void reverse(String str){
    if(str == null || str.length() <=1){
        System.out.print(str);
    }else{
        System.out.print(str.charAt(str.length()-1));
         reverse(str.substring(0, str.length()-1));
    }
}

private static void reverse(char[] charArray, int i, int length) {
	
	if(i < length) {
		char ch = charArray[i];
		charArray[i] = charArray[length];
		charArray[length] = ch;
		i++;
		length--;
		reverse(charArray,i,length);
	}
	
}

}
