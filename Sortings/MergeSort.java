package Sortings;


import java.util.*;

public class MergeSort {
	
	
	public static void mergeSort(int[] input){
		// Write your code here
        if(input.length < 2) return;
        int mid = input.length/2;
        int left[] = new int[mid];
        int right[] = new int[input.length-mid];
        
        for(int i=0;i<mid;i++){
            left[i] = input[i];
        }
        for(int j=0;j<input.length-mid;j++){
            right[j] = input[mid+j];
        }
        mergeSort(left);
        mergeSort(right);
        addAllElement(left , right, input);
        
		
	}
    
    public static void addAllElement(int[] a, int[] b , int[] all){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]) {
                all[k] = a[i];
                i++;
            }else{
                all[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<a.length) all[k++] = a[i++];
        while(j<b.length) all[k++] = b[j++];
                
    }
    public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) arr[i] = sc.nextInt();
		mergeSort(arr);
		printArray(arr);

	}

}
