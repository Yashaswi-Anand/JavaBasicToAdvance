package Recurrence;

public class Factorial {
	
	public static int factorial(int n) {
		if(n==0) return 1;
		int fact  = factorial(n-1);
	    fact = n* fact;
	    return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = factorial(5);   
		System.out.println(fact);   // 120

	}

}
