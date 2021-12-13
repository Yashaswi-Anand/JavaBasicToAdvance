/*
 * Staircase or find step
	A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps 
	at a time. Implement a method to count how many possible ways the child can run up to the stairs. 
	You need to return number of possible ways W.
	
	Input format : Integer N
	Output Format : Integer W
	Constraints : 1 <= N <= 30
	Sample Input 1 :
	4
	Sample Output 1 :
	7
	Sample Input 2 :
	5
	Sample Output 2 :
	13
 * 
 */

package Recurrence;

public class FindStep {
	
	public static int staircase(int n){
		
        if(n==0) return 1;
        else if(n<0) return 0;
        else return staircase(n-3)+staircase(n-2)+staircase(n-1);
	

	}

	public static int findStep(int n)
    {
		int[] res = new int[n + 1];
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;
 
        for (int i = 3; i <= n; i++)
            res[i] = res[i - 1] + res[i - 2] + res[i - 3];
 
        return res[n];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findStep(4));
		System.out.println(staircase(5));

	}

}
