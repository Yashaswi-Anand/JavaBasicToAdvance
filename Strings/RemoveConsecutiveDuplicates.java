/*
 * 	For a given string(str), remove all the consecutive duplicate characters.
	Example:
		Input String: "aaaa"
		Expected Output: "a"
		
		Input String: "aabbbcc"
		Expected Output: "abc"
 */


package Strings;
import java.util.*;
public class RemoveConsecutiveDuplicates {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
        String ans = Character.toString(str.charAt(0));
        
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1) != str.charAt(i)){
                ans = ans+str.charAt(i);
            }
        }
        return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(removeConsecutiveDuplicates(str));

	}

}
