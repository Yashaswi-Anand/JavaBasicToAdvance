package Recurrence_II;

import java.util.Scanner;

public class Subsequence {
	
	public static String[] findSubsequence(String input) {
		 
		if(input.length() == 0) {
			// base case
			String[] output = new String[1];
			output[0] = "";
			return output;
		}
		
		String[] smalloutput = findSubsequence(input.substring(1));
		String[] output = new String[2*smalloutput.length];
		
		for(int i=0;i<smalloutput.length;i++) {
			output[i] = smalloutput[i];
		}
		
		for(int i=0;i<smalloutput.length;i++) {
			output[smalloutput.length + i] = input.charAt(0)+smalloutput[i];
		}
		
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.next();
		String[] ans = findSubsequence(str);
		for(String outputString: ans) {
			System.out.print(outputString+ " ");
		}

	}

}
