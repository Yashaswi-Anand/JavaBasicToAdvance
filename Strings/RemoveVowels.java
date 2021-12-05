package Strings;

public class RemoveVowels {
	
	public static String removeVowels(String str) {
		 // Write your code here.
	        StringBuffer sb = new StringBuffer();
			
			  for(int i=0;i<str.length();i++){ 
				  char ch = str.charAt(i); 
				  if(ch != 'a' && ch != 'A' && ch != 'e' && ch != 'E' && ch != 'i' 
						  && ch != 'I' && ch != 'o' && ch != 'O' && ch != 'u' && ch != 'U'){
					  sb.append(ch); 
				  } 
			  }
			  
	        return sb.toString();
	}

	public static void main(String[] args) {
	
	  String s = "Mobile Screen";
      String str = removeVowels(s) ;
      System.out.println(str);
	}

}
