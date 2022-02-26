/*
 * Input Sample:  	
  	9 
	5 12 3 17 1 18 15 3 17 
	6
	Output :
	3 3 
	5 1
 * 
 */

package Recurrence_II;

import java.util.Scanner;

public class ReturnSubsetsSumToK {
	
	public static int[][] subsetsSumK(int[] input, int p, int start) {
        if (start == input.length) {
            if (p == 0) {
                return new int[1][0];
            }
            else {
                return new int[0][0];
            }
        }
        int cn=input[start];
        int[][] smallans1=subsetsSumK(input, p,start+1);
        int[][] smallans2=subsetsSumK(input, p-cn, start+1);
        
        int[][] myans=new int[smallans1.length+smallans2.length][];
        int k=0;
        for(int i=0;i<smallans1.length;i++){
            myans[k]=smallans1[i];
            k++;  
        }
        
        for(int i=0;i<smallans2.length;i++){
            myans[k]=new int[smallans2[i].length+1];
            myans[k][0]=cn;
            for(int j=0;j<smallans2[i].length;j++){
                myans[k][j+1]=smallans2[i][j];
            }
            k++;
        }
		return myans;
	}

	// Return a 2D array that contains all the subsets which sum to k
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
        return subsetsSumK(input, k, 0);
        

	}

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int k = s.nextInt();
		int output[][] = subsetsSumK(input, k);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}

}
