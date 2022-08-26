package fandamental;
import java.util.Scanner;


public class CheckFibonacciNumber {

	public static boolean Result(double N){
		for(int i=0;i*i<=N;i++){
			if(N%i == 0 && N/i == i){
				// System.out.print(i);
				return true;
			}
		}
		return false;
	}

	public static boolean checkFibonacciNumber(int n){
		double high = 5*n*n+4;
		double low = 5*n*n-4;

		if(Result(high) || Result(low))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for check that number is part of fabonacci series or not : ");
		int n = sc.nextInt();
		System.out.println(checkFibonacciNumber(n));
		sc.close();
		
	}
}