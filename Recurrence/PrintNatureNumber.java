package Recurrence;

public class PrintNatureNumber {
	
	public static void printReverseNatureNumber(int n) {
		if(n==0) return;
		System.out.print(n+" ");
		printReverseNatureNumber(n-1);
	}
	
	public static void printNatureNumber(int n) {
		 if(n ==0) return;
		 printNatureNumber(n-1);
		 System.out.print(n+ " ");
		
	}

	public static void main(String[] args) {
		
		printNatureNumber(10);   // 1 2 3 4 5 6 7 8 9 10 
		System.out.println();
		printReverseNatureNumber(10);  // 10 9 8 7 6 5 4 3 2 1 

	}

}
