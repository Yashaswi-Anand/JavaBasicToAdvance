package Recurrence;

import java.util.Scanner;

class Solution {
  // TODO : error in code
	public static int count(int n){
		if(n == 0){
			return 1;
		}
		
		int smallAns = count(n / 10);
		return smallAns;
	}

}

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Solution.count(n));

	}

}
