package Sortings;

import java.util.Scanner;

public class BubbleSort {
	
	public static void ArrayPrint(int[] arr) {
		 
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void BubbleSort(int[] arr) {
		
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j= 0 ; j<n-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
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
		BubbleSort(arr);

	}

}
