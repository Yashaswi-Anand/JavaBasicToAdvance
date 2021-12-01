/*
	 * You have been given a random integer array/list(ARR) of size N. Write a function that rotates 
	 * the given array/list by D elements(towards the left).
	 Note:
	Change in the input array/list itself. You don't need to return or print the elements.
	
	Input format :
	First line of each test case or query contains an integer 'N' representing the size of the
	array/list.
	
	Second line contains 'N' single space separated integers representing the elements in the
	 array/list.
	
	Third line contains the value of 'D' by which the array/list needs to be rotated.
	Output Format :
	For each test case, print the rotated array/list in a row separated by a single space.
	
	Output for every test case will be printed in a separate line.
	
	Constraints :
	1 <= t <= 10^4
	0 <= N <= 10^6
	0 <= D <= N
	Time Limit: 1 sec
	
	Sample Input 1:
		7
		1 2 3 4 5 6 7 
		2 ----> Output ---> 3 4 5 6 7 1 2
	Sample Input 2:
		7
		1 2 3 4 5 6 7 
		0  ---->  output : 1 2 3 4 5 6 7
	Sample Input 3:
		4
		1 2 3 4
		2  ----> output ----> 3 4 1 2
	
 */


package Arrays;

import java.util.Scanner;

public class RotateArray {
	
	public static void ArrayPrint(int[] arr) {
		 
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int n =arr.length;
        int[] temp = arr;
        int[] dArr  = new int[d] ;
        for(int i=0;i<d;i++){
            dArr[i] = arr[i];
        }
        for(int i=0,j=d;i<n-d && j<n;i++,j++){
            arr[i] = temp[j];
        }
        for(int i=0,j=n-d;i<d && j<n;i++,j++){
            arr[j] = dArr[i];
        }
       
   
        
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
		System.out.println("Enter the rotation point of array: ");
		int d = sc.nextInt();
		rotate(arr,d);
		ArrayPrint(arr);

	}

}
