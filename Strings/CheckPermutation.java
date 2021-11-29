package Strings;

import java.util.Scanner;

public class CheckPermutation {

	
	public static boolean isPermutation(String str1, String str2) {
		
        Boolean isCheck = true;
        int[] arrForchar = new int[256];
        
       // Increase the value of array index
        for(int i=0;i<str1.length();i++){
            arrForchar[(int)str1.charAt(i)] = arrForchar[(int)str1.charAt(i)] + 1;
        }
       // Decrease the value of array index
        for(int i=0;i<str2.length();i++){
            arrForchar[(int)str2.charAt(i)] = arrForchar[(int)str2.charAt(i)] - 1;
        }
        // check permutation
        for(int i=0;i<arrForchar.length;i++) {
        	if(arrForchar[i] != 0) return false;
        }
       
        return isCheck;
	}

   public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.print(isPermutation(str1,str2));
		
	}
}
