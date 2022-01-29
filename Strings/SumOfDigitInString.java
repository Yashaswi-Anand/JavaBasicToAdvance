package Strings;

public class SumOfDigitInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "H4el7lo w6or1ld2";
		int sum=0;
		String digits = "";
		for(int i =0; i<str.length();i++){
			int n = (int)str.charAt(i);
			if(n>= 48 && n<= 57) {
				digits += (char)n;
				sum += n - (int)'0';  // original digit
			}
		}
		System.out.println(digits + " : " + sum);

	}

}
