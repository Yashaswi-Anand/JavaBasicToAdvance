/*
 *   input ----> I am a student of the third year.
 *   output----> I Am A Student Of The Third Year.
 *   
 * 
 */

package Strings;

public class ConvertSmallerToLargerLetter {
	
	
	public static String convertString(String str) {
		StringBuffer s = new StringBuffer(str);
		
		
		//if(str.length() == 0) return str;
		
		if(str.charAt(0) >= 97) {
			char ch =  (char)((int)str.charAt(0)-32);
			s.setCharAt(0,ch);
		}
		
		
		for(int i=0;i<str.length();i++) {
			
			if(i<=str.length()) {
				if(str.charAt(i) == ' ') {
					char ch =  (char)((int)str.charAt(i+1)-32);
					s.setCharAt(i+1,ch);
				}
			}
		}
		return s.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "i  am a student of the third year.";
		// TODO: Not work if add space at end of sentence
		
		String convertedString = convertString(str);
		System.out.println(convertedString);

	}

}
