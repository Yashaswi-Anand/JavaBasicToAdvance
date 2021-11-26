package Strings;

public class StringBufferDemo {
   public static void main(String [] args) {
	   StringBuffer str = new StringBuffer("abc");
	   str.setCharAt(1, 'd');
	   System.out.println(str); //adc
	   str.append("def");
	   System.out.println(str +"  "+ str.length()); // adcdef  6
   }
}
