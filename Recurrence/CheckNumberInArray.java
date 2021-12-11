package Recurrence;

import java.util.Scanner;

public class CheckNumberInArray {
	
	public static boolean checkNumber(int input[], int x) {
		
		// if array is empty
        if( input.length == 0) return false;
        // base case
        if(input[0] == x) return true;
       
        int temp[] = new int[input.length-1];
        for(int i=1;i<input.length;i++){
            temp[i-1] = input[i];
        }
		Boolean isCheckNumber = checkNumber(temp,x);
        return isCheckNumber;
	}
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNumber(input, x));

	}

}
