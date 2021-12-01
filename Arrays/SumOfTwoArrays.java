/*
 * 1) 3
    6 2 4
	  3
    7 5 6  -- > ans--> 1 3 8 0
    
   2) 4
	  9 7 6 1
	  3
	  4 5 9  -- > ans--> 1 0 2 2 0 
	  
	3) 3
		8 5 2
	   2
		1 3  -- > ans--> 0 8 6 5
 *  
 * 
 * 
 */

package Arrays;

import java.util.Scanner;

public class SumOfTwoArrays {
	
	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int n1 = arr1.length;
        int n2 = arr2.length;
        int carry =0;
        int num1 = 0, num2 = 0;
        int k = output.length-1;
        for(int i=n1-1,j=n2-1;i>=0 || j >=0; i--,j--){
            
            num1 = i<0 ? 0 : arr1[i];
            num2 = j<0 ? 0 : arr2[j];
            
            int sum = carry + num1 + num2;
            int rem = sum % 10;
            output[k--] = rem;
            carry = sum/10;
            
        }
        if(carry ==1 ){
            output[0] = carry;
        }
        
    }
	
	public static void printArray(int[] arr) {
		 
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] TakeArrayInput(int n) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array: ");
		int fArraySize = sc.nextInt();
		System.out.println("Enter elements of first array: ");
		int arr1[] = TakeArrayInput(fArraySize);
		
		System.out.println("Enter the size of second array: ");
		int SArraySize = sc.nextInt();
		System.out.println("Enter elements of second array: ");
		int arr2[] = TakeArrayInput(SArraySize);
		
		int[] output = new int[1 + Math.max(arr1.length, arr2.length)];
		
		sumOfTwoArrays(arr1,arr2,output);
		System.out.println("Sum of Two Array: ");
		printArray(output);

	}

}
