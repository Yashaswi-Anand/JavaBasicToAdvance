/* 
 * First Index Of a Number in an Array - Question

	Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
	First index means, the index of first occurrence of x in the input array.
	Do this recursively. Indexing in the array starts from 0.
	
	Input Format :
	Line 1 : An Integer N i.e. size of array
	Line 2 : N integers which are elements of the array, separated by spaces
	Line 3 : Integer x
	
	Output Format : first index or -1
	Constraints : 1 <= N <= 10^3
	Sample Input :
	4
	9 8 10 8
	8
	Sample Output :
	1
 */



package Recurrence;

import java.util.Scanner;

public class FindFirstIndexInArray {
	
	public static int firstIndex(int input[], int x) {
		if(input.length == 0) return -1;
        int index = findFirstIndex(input, x, 0);
        return index;
		
	}
    
    public static int findFirstIndex(int a[], int x, int index){
        if(index == a.length) return -1;
        
        if(a[index] == x) return index;
        int val = findFirstIndex(a,x,index+1);
        
        return val;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++) input[i] = sc.nextInt();
		int x = sc.nextInt();
		System.out.println(firstIndex(input,x));

	}

}
