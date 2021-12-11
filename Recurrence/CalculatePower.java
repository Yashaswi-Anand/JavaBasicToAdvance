package Recurrence;

public class CalculatePower {
	
	public static int calculatePower(int x,int n) {
		if(n==0) return 1;
		if(n==1) return x;
		int smallAns  = calculatePower(x,n-1);
		x= x*smallAns;
		return x;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int power = calculatePower(5,3);  // 125
		System.out.println(power);

	}

}
