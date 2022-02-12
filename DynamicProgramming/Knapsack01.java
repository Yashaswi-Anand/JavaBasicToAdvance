package DynamicProgramming;

public class Knapsack01 {
	
	public static int knapsackIDP(int W,int[] wt,int[] val) {
		
		int n = wt.length;
		int dp[][] = new int[n+1][W+1];
		
		for(int i=n-1;i>=0;i--) {
			for(int w=0;w<=W;w++) {
				int ans;
				if(wt[i] <= w) {
					int ans1 = val[i]+dp[i+1][w-wt[i]];
					int ans2 = dp[i+1][w];
					ans =Math.max(ans1, ans2);
				}else {
					ans = dp[i+1][w];
				}
				dp[i][w] = ans;
			}
		}
		return dp[0][W];
	}
	
	public static int knapsack(int w,int[] wt,int[] val,int i) {
		
		if(i == wt.length) return 0;
		int myAns;
		if(wt[i]<=w) {
			// include ith item
			int ans1 = val[i] + knapsack(w - wt[i],wt,val,i+1);
			// exclude ith item
			int ans2 =  knapsack(w,wt,val,i+1);
			myAns = Math.max(ans1, ans2);
			
		}else {
			// here cannot include ith item
			myAns =  knapsack(w,wt,val,i+1);
		}
		
		return myAns;
	}

	public static void main(String[] args) {
		
		int wt[] = {20,25,30};
		int val[] = {200,300,100};
		int weigth  =  50;
		
		// only recursive method
		int ans = knapsack(weigth,wt,val,0);
		System.out.println(ans);
		
		// using iterative DP method
		int maxVal = knapsackIDP(weigth,wt,val);
		System.out.println(maxVal);
		
	}

}
