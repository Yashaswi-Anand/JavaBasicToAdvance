package Arrays;

import java.util.Arrays;

public class PairSum {
	
	public static int pairSum(int arr[],int x) {
		int count= 0;
		int n = arr.length;
		Arrays.sort(arr); // sort the array
		
		int i=0,j=n-1;
		while(i<j) {
			
			 if (arr[i] + arr[j] == x)
	            {
				 count++;
	                //System.out.println("Pair found (" + nums[low] + "," + nums[high] + ")");
	                
	            }
			if(arr[i]+arr[j] > x) {
				j--;
			}else if(arr[i]+arr[j]<x) {
				i++;
//			}else {
//				int count1=0,count2=0;
//				for(int k=i;k<=j;k++) {
//					if(arr[i] == arr[k]) count1++;
//				}
//				for(int k=j;k>=i;k--) {
//					if(arr[j] ==  arr[k]) count2++;
//				}
//				if(arr[i] == arr[j]) count = (count1* (count2-1))/2;
//				else count = count1*count2;
			}
		}
		
		
		return count;
	}
	
	public static int findPair(int[] nums, int target)
    {
        // sort the array in ascending order
        Arrays.sort(nums);
 
        // maintain two indices pointing to endpoints of the array
        int low = 0;
        int high = nums.length - 1;
        int count = 0;
 
    
        while (low < high)
        {
            
            if (nums[low] + nums[high] == target)
            {
                System.out.println("Pair found (" + nums[low] + "," + nums[high] + ")");
                count++;
               // return;
            }
 
            // increment `low` index if the total is less than the desired sum;
            // decrement `high` index if the total is more than the desired sum
            if (nums[low] + nums[high] < target) {
                low++;
            }
            else {
                high--;
            }
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pair Sum: ");
		int  arr[] = { 2,5,7,9,0,4,3,6 };
		
		int numberOfPair = findPair(arr,9);
		
		System.out.println(numberOfPair);
		

	}

}
