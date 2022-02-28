/*
 * Whis and Beerus are playing a new game today. They form a tower of N coins and make a move in alternate turns. Beerus plays first. In one step, the player can remove either 1, X, or Y coins from the tower. The person to make the last move wins the game. Can you find out who wins the game?
 Input format :
The first and the only line of input contains three integer values separated by a single space. They denote the value of N, X and Y, respectively.
Output format :
Prints the name of the winner, either 'Whis' or 'Beerus' (Without the quotes).
Constraints :
1 <= N <= 10 ^ 6
2 <= X <= Y<= 50

Time Limit: 1 sec
Sample Input 1 :
4 2 3
Sample Output 1 :
Whis
Sample Input 2 :
10 2 4
Sample Output 2 :
Beerus
 */
package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoinTower {
	
	public static String findWinner(int n, int x, int y) {
		//Your code goes here
        int dp[] = new int[n+1];
        dp[1] = 1;
        dp[x] = 1;
        dp[y] = 1;
        
        
        for(int i=2;i<=n;i++){
            if(dp[i] == 0){
                int a = dp[i-1]^1;
                int b=0;
                int c=0;
                if(i-x>1) b= dp[i-x]^1;
                if(i-y>1) c= dp[i-y]^1;
                
                dp[i] = Math.max(a,Math.max(b,c));
            }
            
        }
        
        if(dp[n] != 0){
            return "Beerus";
        }else{
            return "Whis";
        }
	}
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {
            String[] strNums = br.readLine().trim().split("\\s");
            int n = Integer.parseInt(strNums[0]);
            int x = Integer.parseInt(strNums[1]);
            int y = Integer.parseInt(strNums[2]);

            System.out.println(findWinner(n, x, y));
    }

}
