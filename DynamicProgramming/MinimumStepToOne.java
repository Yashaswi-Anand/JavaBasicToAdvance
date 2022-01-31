package DynamicProgramming;

public class MinimumStepToOne {
	
	public static int minimumStepIDP(int n, int[] dp){
		// TODO:  
		return 0;
	}
	
	public static int minimumStepRDP(int n, int[] dp) {
		
		if(n==1) return 0;
		
		int ans1;
		ans1 = minimumStepRDP(n-1,dp);
		dp[n-1] = ans1;
		
		int ans2 = Integer.MAX_VALUE;
		if(n%2 == 0) {
			if(dp[n/2] == -1) {
				ans2 = minimumStepRDP(n/2,dp);
				dp[n/2] = ans2;
			}else {
				ans2 = dp[n/2];
			}
		}
		int ans3 = Integer.MAX_VALUE;
		if(n%3 == 0) {
			if(dp[n/3] == -1) {
				ans3 = minimumStepRDP(n/3,dp);
				dp[n/3] = ans3;
			}else {
				ans3 = dp[n/3];
			}
		}
		
		return Math.min(ans1, Math.min(ans2, ans3)) + 1;
	}
	
	public static int minimumStep(int n) {
		
		// here total time complexity = O(3^n) -> very bad complexity
		
		if( n==1) return 0;
		
		int ans1 = minimumStep(n-1);
		
		int ans2 = Integer.MAX_VALUE;
		if(n%2 == 0) {
			ans2 = minimumStep(n/2);
		}
		
		int ans3 = Integer.MAX_VALUE;
		if(n%3 == 0) {
			ans3 = minimumStep(n/3);
		}
		int min = Math.min(ans1, Math.min(ans2, ans3))+1; 
		return min;
	}

	public static void main(String[] args) {
		
		// using brute force approach
		int step  = minimumStep(10);
		System.out.println(step);
		
		// recursive using dp
		int n = 10;
		int dp[] =new int[n+1];
		for(int i=0;i<dp.length;i++) {
			dp[i] = -1;
		}
		int stp = minimumStepRDP(n,dp);
		System.out.println(stp);
		
		

	}

}
