package Recurrence_II;

import java.util.Scanner;

public class PrintFactorial {
	
	public static void factorial2(int n, int ans) {
		
		if(n==1) {
			System.out.println("Factorial: "+ ans);
			return;
		}
		factorial2(n-1, n*ans);
	}
	
	
	public static int factorial1(int n) {
		if(n == 0 || n==1) {
			return 1;
		}
		int smallans = factorial1(n-1);
		return n * smallans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial1(n));
		factorial2(n,1);
		

	}

}
