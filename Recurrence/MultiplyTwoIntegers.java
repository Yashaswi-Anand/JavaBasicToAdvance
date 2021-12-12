package Recurrence;

import java.util.Scanner;

public class MultiplyTwoIntegers {
	
	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
        if(n==0) return 0;
        if(n==1) return m;
        int smallAns = multiplyTwoIntegers(m,n-1);
        return m+smallAns;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(multiplyTwoIntegers(m,n));

	}

}
