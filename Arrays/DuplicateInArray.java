/*
 *  5
    0 2 1 3 1 ----> answer = 1
	7
	0 3 1 5 4 3 2 ----> answer = 3
 *  
 */

package Arrays;
import java.util.Scanner;

public class DuplicateInArray {
	
	
	public static int findDuplicate(int[] arr) {
		//Your code goes here
        int ans = 0;
        int[] sortedArr = insertionSort(arr);
        
        for(int i=1;i<sortedArr.length;i++){
            if(sortedArr[i-1] == sortedArr[i]){
                ans = sortedArr[i];
            }
        }
        return ans;
	}
    
    public static int[] insertionSort(int[] arr) {
		
		for(int i=1;i<arr.length;i++){
            int j=i-1;
            int temp = arr[i];
            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size of array:");
    	int n = sc.nextInt();
    	System.out.println("Enter the elements of array:");
    	int arr[]  = new int[n];
    	for(int i=0;i<arr.length;i++) {
    		arr[i] = sc.nextInt();
    	}
    	System.out.println(findDuplicate(arr));
	}

}
