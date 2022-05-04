package Arrays;

import java.util.*;

public class KadaneAlogrithm {
    public static int findMaxSum(int[] arr) {
        //Your code goes here
        int maxSum = 0;
        int currSum = 0;
        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size of array:");
    	int n = sc.nextInt();
    	System.out.println("Enter the elements of array:");
    	int arr[]  = new int[n];
    	for(int i=0;i<arr.length;i++) {
    		arr[i] = sc.nextInt();
    	}
    	System.out.println(findMaxSum(arr));
        sc.close();
    }
}
