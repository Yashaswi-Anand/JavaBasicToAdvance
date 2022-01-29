package Recurrence_II;

import java.util.Scanner;

public class ReturnKeypadCode {
	
	public static void printKeypad(int input, String stringSofar) {
		
		if(input == 0) {
			System.out.print(stringSofar+ " ");
			return;
		}
		
		int digit = input%10;
		
		String digitString = getOptions(digit);
		for(int i=0;i<digitString.length();i++) {
			printKeypad(input/10,digitString.charAt(i)+ stringSofar);
		}
	}
	
	public static String getOptions(int digit) {
		if(digit == 2) {
			return "abc";
		}
		if(digit == 3) {
			return "def";
		}
		if(digit == 4) {
			return "ghi";
		}
		if(digit == 5) {
			return "jkl";
		}
		if(digit == 6) {
			return "mno";
		}
		if(digit == 7) {
			return "pqrs";
		}
		if(digit == 8) {
			return "tuv";
		}
		if(digit == 9) {
			return "wxyz";
		}
		return "";
	}
	
	public static String[] returnKeypadCode(int n) {
		
		if(n == 0 ) {
			String[] output = new String[1];
			output[0] = " ";
			return output;	
		}
		
		String[] smallOutput = returnKeypadCode(n/10);
		int lastDigit = n%10;
		String lastDigitOption = getOptions(lastDigit);
		String[] Output = new String[smallOutput.length * lastDigitOption.length()]; 
		
		int k = 0;
		for(int i=0;i<smallOutput.length;i++) {
			for(int j=0;j<lastDigitOption.length();j++) {
				Output[k++] = lastDigitOption.charAt(j) + smallOutput[i];
			}
		}
		return Output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter keypad: ");
		int n = sc.nextInt();
		String[] output = returnKeypadCode(n);
		
		for(String i: output) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		printKeypad(n,"");
		

	}

}
