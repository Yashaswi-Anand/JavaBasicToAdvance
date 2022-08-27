package Arrays;
import java.util.*;

/*
 Problem 1:
    n=9
    1 2 3 4 5 6 7 8 
    k = 3
    ans = [3, 2, 1, 6, 5, 4, 9, 8, 7]

 Problem 2:
    n=8
    1 2 3 4 5 6 7 8
    k=10
    ans = [8, 7, 6, 5, 4, 3, 2, 1]

 */

public class ReverseArrayInGivenGroup {


    public static void reverseArrray(int arr[],int low, int high){
        int i=low;
        int j=high;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++;j--;
        }
    }

    public static int[] reverseArrayInGroup(int arr[],int n,int k){

        if(k==0||k==1) return arr;
        for(int i=0;i<n;i+=k){
            int pre=i;
            int last=i+k-1;
            if(last>=n)
                reverseArrray(arr,pre,n-1);
            else
                reverseArrray(arr,pre,last);
        }
        return arr;
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
        System.out.println("Enter size of group:");
        int k =  sc.nextInt();
        System.out.println(Arrays.toString(reverseArrayInGroup(arr,size,k)));
    }
}
