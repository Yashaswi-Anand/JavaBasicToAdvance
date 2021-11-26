package Strings;

import java.util.*;

public class BasicStringFunction {

	public static void main(String[] args) {
		char charArray[] = {'C','o','d','i','n','g'};
		String str1 = "Coding";
		String str2 = " is fun.";
		// Concatenation
		System.out.println((str1+ str2) + " OR "+ str1.concat(str2) ); //Coding is fun. OR Coding is fun.
		
		// Comparison
		String str3 = "Coding";
		System.out.println(str1 == str3); //true
		System.out.println(str1.compareTo(str3)); //0
		String str4 = "Ceding";
		System.out.println(str1.compareTo(str4)); // 10
		System.out.println(str1.equals(str4));  // false
		
		String a = "abcd";
		String b = "abcda";
		System.out.println(a.compareTo(b));  //-1
		
		// sub String
		String substr = str3.substring(2);
		System.out.println(substr + "  -->Length: "+ substr.length()); //ding  -->Length: 4
		String substr1 = str3.substring(1,5);
		System.out.println(substr1 + "  -->Length: "+ substr1.length()); //odin  -->Length: 4
		
		// Input of String 
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println(s1); // yash anand --> yash
		//String s2 = sc.nextLine();
		//System.out.println(s2);  //yash anand -->yash anand
		
		// contains-----------------
		String c1 = "abc";
		String c2 = "a";
		System.out.println(c1.contains(s1));
		

	}

}
