/* 
 * 	For a given a string(str), find and return the highest occurring character.
	Example:
		Input String: "abcdeapapqarr"
		Expected Output: 'a'
			Since 'a' has appeared four times in the string
		 	which happens to be the highest frequency character,the answer would be 'a'.
 * */



package Strings;
import java.util.Scanner;

public class HighestOccuringCharacter {

	
	public static char highestOccuringChar(String str) {
		//Your code goes here
        int[] arrForChar = new int[256];
        
        for(int i=0;i<str.length();i++){
            arrForChar[(int)str.charAt(i)] = arrForChar[(int)str.charAt(i)] + 1;
        }
        int max = 0;
        int index = 0;
        for(int i=0;i<arrForChar.length;i++){
            if(max < arrForChar[i]){
                max = arrForChar[i];
                index = i;
            }
        }
        char ch = (char)index;
        return ch;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(highestOccuringChar(str));
	}
	

}
