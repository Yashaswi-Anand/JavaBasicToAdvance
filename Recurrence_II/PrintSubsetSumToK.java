package Recurrence_II;

import java.util.Scanner;

public class PrintSubsetSumToK {
	
	public static void printSubsetsSumTok(int input[], int k, int start,int[] helperArray){
        if(start == input.length){
            if(k == 0){
                for(int i=0;i<helperArray.length;i++){
                    if(i != helperArray.length-1){
                        System.out.print(helperArray[i]+ " ");
                    }else{
                        System.out.print(helperArray[i]);
                    }
                }
                System.out.println();
                return;
            }else return;
        }
        
        int[] output = new int[helperArray.length +1];
        int i=0;
        while(i < helperArray.length){
            output[i] = helperArray[i];
            i++;
        }
        
        output[i] = input[start];
        printSubsetsSumTok(input,k-input[start],start+1,output);
        printSubsetsSumTok(input,k,start+1,helperArray);
       
    }
    
	public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here
        int helperArray[] = new int[0];
        printSubsetsSumTok(input,k,0,helperArray);
		
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
		printSubsetsSumTok(input, k);
	}
}
