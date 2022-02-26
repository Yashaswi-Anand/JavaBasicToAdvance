/* Input:
 * 	abc
   Output:
	abc
	bac
	bca
	acb
	cab
	cba
 */

package Recurrence_II;

import java.util.Scanner;

public class ReturnPermutationsOfString {
	
	public static int facto(int n){
        if(n==1 || n==0) return 1;
        
        int smallAns = facto(n-1);
        return n*smallAns;
    }
    
    // second method using insert all side
    public static String[] permutationOfStringHelper(String input){
        
        if(input.length() == 1){
            String[] output =  { input };
            return output;
        }
        String[] smallAns = permutationOfStringHelper(input.substring(1));
        String[] output = new String[facto(smallAns[0].length() + 1)];
        
        int k =0;
        for(int i=0;i<smallAns.length;i++){
            
            String temp = smallAns[i];
            for(int j=0;j<=temp.length();j++){
                output[k] = temp.substring(0,j)+input.charAt(0)+temp.substring(j);
                //System.out.print(output[k]+ " ");
                k++;
            }   
        }
        return output;
    }
	
	public static String[] permutationOfString(String input){
		// Write your code here
        
        return permutationOfStringHelper(input);
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String output[] = permutationOfString(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}


}
