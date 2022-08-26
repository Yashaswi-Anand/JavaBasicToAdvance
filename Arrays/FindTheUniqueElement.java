/*
 * You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
  Example:
   5
   2 4 7 2 7 ---> answer= 4
   9
   1 3 1 3 6 6 7 10 7 ---> answer= 10


 */

package Arrays;
import java.util.Scanner;

public class FindTheUniqueElement {

	public static int findUnique(int[] arr) {
		//Your code goes here
        int sum =0;
        int sortedArr[] = insertionSort(arr);
        for(int i=0;i<sortedArr.length;i++){
            sum += sortedArr[i]; 
        }
        for(int i=1;i<sortedArr.length;i++){
           if(sortedArr[i-1] == sortedArr[i]){
               sum = sum - 2*sortedArr[i];
           } 
        }
        
        
        return sum;
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

    public static int UniqueElmentByXOR(int arr[]){
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            ans = ans^arr[i];
        }
        return ans;
    }
	
    public static void main(String[] args) {

		// Method 1: Using sort
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size of array:");
    	int n = sc.nextInt();
    	System.out.println("Enter the elements of array:");
    	int arr[]  = new int[n];
    	for(int i=0;i<arr.length;i++) {
    		arr[i] = sc.nextInt();
    	}
    	System.out.println(findUnique(arr));

        // Method 2: using XOR
        System.out.println(UniqueElmentByXOR(arr));
	}



}
