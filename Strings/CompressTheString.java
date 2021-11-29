/*
 * Write a program to do basic string compression. 
 * For a character which is consecutively repeated more than once,
 *  replace consecutive duplicate occurrences with the count of repetitions.
	Example:
	If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5",
	"xxyyabbccc" ---->  "x2y2ab2c3"
.
	
	The string is compressed only when the repeated character count is more than 1.
 */


package Strings;
import java.util.*;

public class CompressTheString {

	public static String getCompressedString(String str) {
		// Write your code here.
        char ch = str.charAt(0);
        int count = 0;
        String ans ="";
        int i=0;
        for(;i<str.length();i++){
            if(ch == str.charAt(i)){
                count++;
            }else{
                if(count ==1)
                    ans += Character.toString(ch);
                else
                	ans += Character.toString(ch) + count;
                ch = str.charAt(i);
                count = 1;
            } 
            
        }
        for(;i<str.length();i++){
            if(ch == str.charAt(i)){
                count++;
            }
        }
        if(count==1)
            ans += Character.toString(ch);
        else
            ans += Character.toString(ch) + count;
        return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(getCompressedString(str));
	}

}
