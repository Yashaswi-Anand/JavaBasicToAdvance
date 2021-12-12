/*
 *  Last Index Of a Number in an Array - Question

	Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
	Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
	You should start traversing your array from 0, not from (N - 1).
	Do this recursively. Indexing in the array starts from 0.
	
	Input Format :
	Line 1 : An Integer N i.e. size of array
	Line 2 : N integers which are elements of the array, separated by spaces
	Line 3 : Integer x
	
	Output Format : last index or -1
	Constraints : 1 <= N <= 10^3
	Sample Input :
	4
	9 8 10 8
	8
	Sample Output :
	3
 * 
 */

package Recurrence;

import java.util.Scanner;

public class LastIndexOfANumberInAnArray {
	
	public static int lastIndex(int input[], int x) {
		if(input.length == 0) return -1;
        int index = findlastIndex(input,x,input.length-1);
        return index;
	}
    
    public static int findlastIndex(int a[],int x,int index){
        
        if(index < 0 ) return -1;
        if(a[index] == x) return index;
        int val = findlastIndex(a,x,index-1);
        return val;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++) input[i] = sc.nextInt();
		int x = sc.nextInt();
		System.out.println(lastIndex(input,x));

	}

}
