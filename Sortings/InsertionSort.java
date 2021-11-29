package Sortings;

import java.util.Scanner;

public class InsertionSort {
	
	public static void ArrayPrint(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void insertionSort(int[] arr) {
		
		for(int i=1;i<arr.length;i++){
            int j=i-1;
            int temp = arr[i];
            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
		
		ArrayPrint(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the size of array: ");
		int n = sc.nextInt();
		System.out.println(" Enter elements of array: ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		insertionSort(arr);

	}

}
