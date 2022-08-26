package Arrays;

import java.util.Scanner;

public class LeaderInAnArray {

    public static void printLeader(int arr[], int n){
        int leader = arr[n-1];
        System.out.print(leader+" ");
        for(int i=n-1;i>=0;i--){
            if(arr[i]> leader){
                leader = arr[i];
                System.out.print(leader+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        System.out.println("Enter element of array:");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        printLeader(arr,size);
        sc.close();
    }
}
