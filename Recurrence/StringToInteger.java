package Recurrence;

import java.util.Scanner;

public class StringToInteger {
	
	public static int convertStringToInt(String input){
		// base case
        if(input.length() == 0) return 0;
        int a = input.charAt(input.length()-1) - '0';
        // find small output
        int smallAns = convertStringToInt(input.substring(0,input.length()-1));
        return smallAns*10+a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numeric string for integer:");
		String input = sc.next();
		int ans = convertStringToInt(input);
		System.out.println(ans);
	}

}
