/*GFG
Given a string S and another string patt. Find the character in patt that is present at the minimum index in S.
 

Example 1:

Input: S = "zsyle", patt = "bjz"
Output: "z"
Example 2:

Input: S = "anskg", patt = "me"
Output: "$"
 

Your Task:
You don't need to read or print anything. Your task is to complete the function printMinIndexChar() which takes S and patt as input parameter and returns the character in patt that is present at the minimum index in S. If not possible returns "$".
 

Expected Time Complexity: O(max(|str|, |patt|))
Expected Auxilary Space: O(K) where K <= 26
 

Constraints:
1 ≤ |S|, |patt| ≤ 104
*/

package Strings;
import java.util.*;

public class MinimumIndexCharacter {
    
    public static String printMinIndexChar(String S, String patt){
        
        // Your code here
        int min = Integer.MAX_VALUE;
        
        String s[] = S.split("");
        List<String> list = new ArrayList<>(Arrays.asList(s));
        
        for(int i=0;i<patt.length();i++){
            int index = list.indexOf(String.valueOf(patt.charAt(i)));
            if(index != -1) min = Math.min(index,min);
        }
        
        if(min == Integer.MAX_VALUE){
            return "$";
        }else{
            return String.valueOf(S.charAt(min));
        }
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String patt = sc.nextLine();
        System.out.println(printMinIndexChar(str,patt));
        sc.close();
    }
}
