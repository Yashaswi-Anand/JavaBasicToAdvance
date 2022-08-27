/*
    LeetCode Problem
    Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

    A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

    Example 1:

    Input: nums = [0,2,1,5,3,4]
    Output: [0,1,2,4,5,3]
    Explanation: The array ans is built as follows: 
    ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
        = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
        = [0,1,2,4,5,3]
    
    Follow-up: Can you solve it without using an extra space (i.e., O(1) memory)?
*/


package Arrays;
import java.util.*;

public class BuildArrayFromPermuation {

    public static int[] buildArray(int[] nums) {
        int n=nums.length;

        for(int i=0; i<n; i++) {
            nums[i]=nums[i]+(nums[nums[i]]%n)*n;
        }
         
        for(int i=0; i<n; i++) {
            nums[i]=nums[i]/n;
        }
        
         return nums;
         
     }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size =  sc.nextInt();
        System.out.println("Enter the element of array:");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(buildArray(arr)));
     }


}
