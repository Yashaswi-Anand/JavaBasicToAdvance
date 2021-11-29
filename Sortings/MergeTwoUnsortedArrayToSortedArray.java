package Sortings;

import java.util.*;

public class MergeTwoUnsortedArrayToSortedArray {

	public static int[] UnsortedToSorted(int[] arr1,int[] arr2) {
		
		int n= arr1.length;
		int m = arr2.length;
		int ansArr[] = new int[n+m]; 
		int i=0, j=0,k=0;
		while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
            	ansArr[k] = arr1[i];
                i++; k++;
            }
            else{
            	ansArr[k] = arr2[j];
                j++; k++;
            }
            
        }
        while(i<n){
        	ansArr[k] =arr1[i];
                i++;k++;
            }
            while(j<m){
            	ansArr[k] = arr2[j];
                j++;k++;
            }
		return ansArr;
		
	}
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3,1,7,0,9,2};
		int[] arr2 = {5,6,8,4};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		printArray(UnsortedToSorted(arr1,arr2));

	}

}
