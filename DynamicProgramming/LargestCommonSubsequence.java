package DynamicProgramming;

public class LargestCommonSubsequence {
	
	// using iterative DP method
	public static int LCSWithIndexIDP(String str1, String str2) {
		
		int m = str1.length();
		int n = str2.length();
		
		int dp[][] = new int[m+1][n+1];
	
		
		for(int i=m-1;i>=0;i--) {
			for(int j= n-1;j>=0;j--){
				
				int ans;
				if(str1.charAt(i) == str2.charAt(j)) {
					ans = 1+ dp[i+1][j+1];
				}else {
					int ans1 = dp[i][j+1];
					int ans2 = dp[i+1][j];
					ans = Math.max(ans1, ans2);
				}
				dp[i][j] = ans;
				
			}
		}
		return dp[0][0];
	}
	
	// using recursive DP method
	public static int LCSWithIndexRDP(String str1, String str2,int i,int j,int[][] dp){
		
		if(str1.length() == i || str2.length()==j) return 0;
		
		int len = 0;
		if(str1.charAt(i) == str2.charAt(j)) {
			if(dp[i+1][j+1] == -1) {
				int smallAns =  LCSWithIndexRDP(str1,str2,i+1,j+1,dp);
				dp[i+1][j+1] = smallAns;
				len = 1+ smallAns;
			}else {
				len = 1+dp[i+1][j+1];
			}
		}else {
			int ans1,ans2;
			if(dp[i][j+1] == -1) {
				ans1 = LCSWithIndexRDP(str1,str2,i,j+1,dp);
				dp[i][j+1] = ans1;
			}else {
				ans1 = dp[i][j+1];
			}
			 
			if(dp[i+1][j] == -1) {
				ans2 = LCSWithIndexRDP(str1,str2,i+1,j,dp);
				dp[i+1][j] = ans2;
			}else {
				ans2 = dp[i+1][j];
			}
			
			len = Math.max(ans1, ans2);
		}
		
		return len;
		
	}
	
	public static int LCSWithIndex(String str1, String str2,int i,int j){
		
		if(str1.length() == i || str2.length()==j) return 0;
		
		int len = 0;
		if(str1.charAt(i) == str2.charAt(j)) {
			int smallAns =  LCSWithIndex(str1,str2,i+1,j+1);
			len = 1+ smallAns;
		}else {
			int ans1 = LCSWithIndex(str1,str2,i,j+1);
			int ans2 = LCSWithIndex(str1,str2,i+1,j);
			len = Math.max(ans1, ans2);
		}
		
		return len;
		
	}
	
	public static int LCS(String str1, String str2){
		
		if(str1.length() == 0 || str2.length()==0) return 0;
		
		int len = 0;
		if(str1.charAt(0) == str2.charAt(0)) {
			len =  1+ LCS(str1.substring(1),str2.substring(1));
		}else {
			int ans1 = LCS(str1,str2.substring(1));
			int ans2 = LCS(str1.substring(1),str2);
			len = Math.max(ans1, ans2);
		}
		
		return len;
		
	}

	public static void main(String[] args) {
		
		String str1 = "abcdb";
		String str2 = "bcacdhb";
		// using recursion only
		int len = LCSWithIndex(str1,str2,0,0);
		System.out.println(len);
		
		// using recursive DP only
		int dp[][] = new int[str1.length()+1][str2.length()+1];
		// length of lcs is 0,1,2,... never be negative
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[i].length;j++) {
				dp[i][j] = -1;
			}
		}
		int lent = LCSWithIndexRDP(str1,str2,0,0,dp);
		System.out.println(lent);
		
		// using iterative DP only
		int length = LCSWithIndexIDP(str1,str2);
		System.out.println(length);

	}

}
