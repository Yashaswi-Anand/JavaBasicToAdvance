package DynamicProgramming;

import java.util.Scanner;

public class FibonacciNumber {
	
	// iterative method using dynamic programming 
	// time complexity -> O(n) & space complexity -> O(n)
	public static int fib_it(int n) {
		
		if(n==1 || n==0) {
			return n;
		}
		
		int dp[] = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i=2;i<=n;i++) {
			dp[2] = dp[n-1]+dp[n-2];
		}
		
		return dp[n];
	}
	
	// recursive method using dynamic programming 
	// time complexity -> O(n) & space complexity -> O(n)
	public static int fib_dp(int n, int dp[]) {
		
		if(n==1 || n==0) return n;
		int ans1;
		int ans2;
		
		if(dp[n-1] == -1){
			ans1 = fib_dp(n-1,dp);
			dp[n-1] = ans1;
		}else {
			ans1 = dp[n-1];
		}
		
		if(dp[n-2] == -1){
			ans2 = fib_dp(n-2,dp);
			dp[n-2] = ans2;
		}else{
			ans2 = dp[n-2];
		}
		
		return ans1+ans2;
		
	}
	
	public static int fibb(int n) {
		
		// here total time complexity = O(2^n) -> very bad complexity 
		
		if(n==1 || n==0) {
			return n;
		}
		int ans1 = fibb(n-1);
		int ans2 =  fibb(n-2);
		
		return ans1+ans2;
	}

	public static void main(String[] args) {
		
		// brute force approach
		System.out.println(fibb(3));
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n+1];
		
		for(int i=0;i<n;i++) {
			dp[i] = -1;
		}
		// recursive dp approach
		int ans = fib_dp(n,dp);
		System.out.println(ans);

		// iterative dp approach
		System.out.println(	fib_it(n));
	}

}
