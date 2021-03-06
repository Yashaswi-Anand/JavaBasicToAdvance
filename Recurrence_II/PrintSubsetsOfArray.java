package Recurrence_II;

import java.util.Scanner;

public class PrintSubsetsOfArray {
	
	public static void printSubsets(int input[], int index, int[] output){
        if(index == input.length){
            for(int i=0;i<output.length;i++){
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }
        
        int newOutput[] = new int[output.length+1];
        
        int i=0;
        while(i<output.length){
            newOutput[i] = output[i];
            i++;
        }
        newOutput[i] = input[index];
        printSubsets(input,index+1,output);
        printSubsets(input,index+1,newOutput);
        
        
    }
    
	public static void printSubsets(int input[]) {
		// Write your code here
        int output[] = new int[0];
        printSubsets(input,0,output);

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
		printSubsets(input);
	}
}
