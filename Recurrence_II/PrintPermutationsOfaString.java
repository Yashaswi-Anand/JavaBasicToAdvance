package Recurrence_II;

import java.util.Scanner;

public class PrintPermutationsOfaString {
	
	public static void permutations(String input, String output){
        
        if(input.length() == 0){
            System.out.println(output);
            return;
        }
        
        for(int i=0;i<input.length();i++){
    
            String smallInput = input.substring(0,i)+input.substring(i+1);
            permutations(smallInput,output+input.charAt(i));
        
        }
    }

	public static void permutations(String input){
		permutations(input,"");
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		permutations(input);
	}

}
