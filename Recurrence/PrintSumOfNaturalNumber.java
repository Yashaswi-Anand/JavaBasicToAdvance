package Recurrence;

public class PrintSumOfNaturalNumber {
	
	
	public static int SumOfNaturalNumber(int n) {
		if(n==0) return 0;
		int sum = SumOfNaturalNumber(n-1);
		sum+= n;
		return sum;
	}

	public static void main(String[] args) {
		
		int sum = SumOfNaturalNumber(10);
		System.out.println(sum);  // 55

	}

}
