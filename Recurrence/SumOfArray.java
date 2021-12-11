package Recurrence;

import java.util.Scanner;

public class SumOfArray {
	
	public static int sum(int input[]) {
		// base case
        if(input.length == 0) return 0;
        
        
        int sumVal = input[0];
        // create smaller array and swap element from original array : index from i+1 to n-1 
        int[] temp = new int[input.length-1];
        for(int i=1;i<input.length;i++){
            temp[i-1] = input[i];
        }
    	int smallSum = sum(temp);
        sumVal += smallSum;
        return sumVal;
        
		
	}
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		int sum = sum(input);
		System.out.println(sum);

	}

}
