package DynamicProgramming;

public class minimumSquareToRepresentN {
	
	public static int minSquareRDP(int n, int[] dp){
		
		if(n == 0) return 0;
		int min = Integer.MAX_VALUE;
		
		for(int i=1;i*i<=n;i++){
			int current;
			if(dp[n - (i*i)] == -1) {
				current = minSquare(n - (i*i));
				dp[n - (i*i)] = current;
			}else {
				current = dp[n - (i*i)];
			}
			if(current<min) min = current;
		}
		return min+1;
	}
	
	public static int minSquare(int n){
		
		if(n == 0) return 0;
		int min = Integer.MAX_VALUE;
		
		for(int i=1;i*i<=n;i++){
			int current = minSquare(n - (i*i));
			if(current<min) min = current;
		}
		
		return min+1;
	}

	public static void main(String[] args) {
		System.out.println(minSquare(41));
		
		int n = 12;
		int dp[] = new int[n+1];
		for(int i=0;i<dp.length;i++){
			dp[i] = -1;
		}
		System.out.println(minSquareRDP(n,dp));

	}

}
