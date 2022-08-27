package Arrays;
import java.util.*;

/*
  Problem 1: n=4 , [1,4,2,5] => 2 ([1+4] == [5])
  Problem 2: n=6 , [2,3,4,1,4,5] => 1 ([2+3+4]== [4,5])
 */

public class EquilibriumPoint {

    public static int equilibriumPoint(int arr[], int n){

        int prefixSum[] = new int[n];
        int suffixSum[] = new int[n];

        prefixSum[0]= arr[0];
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1]+arr[i];
        }

        suffixSum[n-1] = arr[n-1];
        for(int j=n-2;j>=0;j--){
            suffixSum[j]= suffixSum[j+1]+arr[j];
        }
        //System.out.println(Arrays.toString(suffixSum));

        for(int k=0;k<n;k++){
            if(prefixSum[k]==suffixSum[k]) return arr[k];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arry:");
        int size =  sc.nextInt();
        System.out.println("Enter the element of array:");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println(equilibriumPoint(arr,size));
    }
}
