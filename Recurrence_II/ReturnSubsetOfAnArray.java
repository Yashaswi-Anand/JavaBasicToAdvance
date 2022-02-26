/*
 * Input sample:
 *  3
	15 20 12
 * Output:
 * 	12 
	20 
	20 12 
	15 
	15 12 
	15 20 
	15 20 12 
 * 
 */

package Recurrence_II;

import java.util.Scanner;

public class ReturnSubsetOfAnArray {
	
	public static int[][] subsetHelper(int input[], int startIndex){
        
        if(startIndex == input.length){
            return  new int[1][0];
        }
        
        int element = input[startIndex];
        int smallans[][] = subsetHelper(input,startIndex+1);
        
        int output[][]  = new int[2*smallans.length][];
        
        int k=0;
        for(int i=0;i<smallans.length;i++){
            output[k] = new int[smallans[i].length];
            for(int j=0;j<smallans[i].length;j++){
                output[k][j] = smallans[i][j];
            }
            k++;
        }
        
        for(int i=0;i<smallans.length;i++){
            output[k] = new int[smallans[i].length +1];
            output[k][0] = element;
            for(int j=1;j<=smallans[i].length;j++){
                output[k][j]  = smallans[i][j-1];
            }
            k++;
        }
        
        return output;
    }

	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		// Write your code here
        return subsetHelper(input,0);
	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int output[][] = subsets(input);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}

}
