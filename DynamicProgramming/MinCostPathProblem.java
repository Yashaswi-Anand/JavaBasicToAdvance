package DynamicProgramming;

import java.util.Scanner;
import java.lang.*;

/*
 *  matrix[][] = {{3,4,1,2},{2,1,8,9},{4,7,8,1}} -> ans 13
 */

public class MinCostPathProblem {
	
	public static int findMinCostPathRDP(int[][] mat,int i,int j,int[][] dp){
		
		if(mat.length == 0) return 0;
		int row = mat.length;
		int col = Integer.MAX_VALUE;
		if(row != 0) col = mat[0].length;
		
		// Edge and base case
		if(i>=row || j>=col) return Integer.MAX_VALUE;
		// Special case -> last element in 2d array
		if(i == row-1 && j == col-1) return mat[i][j];
		
		// move down
		int down;
		if(dp[i+1][j] == Integer.MIN_VALUE) {
			down = findMinCostPath(mat, i+1,j);
			dp[i+1][j] = down;
		}else {
			down = dp[i+1][j];
		}
		
		// move right
		int right;
		if(dp[i][j+1] == Integer.MIN_VALUE) {
			right = findMinCostPath(mat, i,j+1);
			dp[i][j+1] = right;
		}else {
			right = dp[i][j+1];
		}
		// move diagonal
		int dig;
		if(dp[i+1][j+1] == Integer.MIN_VALUE) {
			dig = findMinCostPath(mat, i+1,j+1);
			dp[i+1][j+1] = dig;
		}else {
			dig = dp[i+1][j+1];
		}
		
		int minSum = Math.min(down, Math.min(right, dig));
		
		return mat[i][j] + minSum;
	}
	
	public static int findMinCostPath(int[][] mat,int i,int j){
		
		if(mat.length == 0) return 0;
		int row = mat.length;
		int col = Integer.MAX_VALUE;
		if(row != 0) col = mat[0].length;
		
		// Edge and base case
		if(i>=row || j>=col) return Integer.MAX_VALUE;
		// Special case -> last element in 2d array
		if(i == row-1 && j == col-1) return mat[i][j];
		
		// move down
		int down = findMinCostPath(mat, i+1,j);
		// move right
		int right = findMinCostPath(mat, i,j+1);
		// move diagonal
		int dig = findMinCostPath(mat, i+1,j+1);
		
		int minSum = Math.min(down, Math.min(right, dig));
		
		return mat[i][j] + minSum;
	}
	
	public static int[][] takeInput2dArray(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row: ");
		int m = sc.nextInt();
		System.out.println("Enter number of col: ");
		int n = sc.nextInt();
		int arr2d[][] = new int[m][n];
		System.out.println("Enter elements: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr2d[i][j] = sc.nextInt();
			}
		}
		
		return arr2d;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int matrix[][] = takeInput2dArray();
		int matrix[][] = {{3,4,1,2},{2,1,8,9},{4,7,8,1}};
		
		// using recursion method
		int pathSum = findMinCostPath(matrix,0,0);
		System.out.println("Answer using recursion method: " + pathSum);
		
		// using recursive dp only
		// here add 1 more row and col in dp array
		int dp[][] = new int[matrix.length+1][matrix[0].length+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j] = Integer.MIN_VALUE;
			}
		}
		
		int dpPathSum = findMinCostPathRDP(matrix,0,0,dp);
		System.out.println("Answer using recursion DP method: " + dpPathSum);
		
		

	}

}
