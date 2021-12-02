/*
 * You have been given a random integer array/list(ARR) of size N. 
  	You are required to find and return the second largest element present in the array/list.
	If N <= 1 or all the elements are same in the array/list then return -2147483648 or -2 ^ 31
	(It is the smallest value for the range of Integer)
	
	1) Sample input = 7
		2 13 4 1 3 6 28  ---> 13 
	2) Sample input = 6
		10 20 20 90 80 80  ---> 80 
 * 
 * 
 */



package Arrays;

import java.util.Scanner;

public class SecondLargestInArray {
	
	public static int secondLargestElement(int[] arr) {
    	//Your code goes here
        int n = arr.length;
        int largest =  Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // if n <= 1 than return min value of integer
        if(n<=1) return Integer.MIN_VALUE;
        
        // find first largest number
        for(int i=0;i<n;i++){
            if(largest < arr[i]) largest = arr[i];
        }
        
        // find second largest number
        for(int i=0;i<n;i++){
            if(largest != arr[i]){
                if(secondLargest < arr[i]) secondLargest = arr[i];
            }
        }
        
        return secondLargest;
        
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		System.out.println("Enter elements of array: ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int secondLargest = secondLargestElement(arr);
		System.out.println(secondLargest);

	}

}
