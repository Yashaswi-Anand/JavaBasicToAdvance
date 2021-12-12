// 12345 --->ans = 15

package Recurrence;

import java.util.Scanner;

public class SumOfDigits {
	
	public static int sumOfDigits(int input){
		// Write your code here
        if(input == 0) return 0;
        int rem = input%10;
        int smallAns = sumOfDigits(input/10);
        return rem+smallAns;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(sumOfDigits(input));

	}

}
