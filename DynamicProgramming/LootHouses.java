/*
 * A thief wants to loot houses. He knows the amount of money in each house. He cannot loot two consecutive houses. 
 * Find the maximum amount of money he can loot.
Input format :
The first line of input contains an integer value of 'n'. It is the total number of houses.

The second line of input contains 'n' integer values separated by a single space denoting 
the amount of money each house has.
Output format :
Print the the maximum money that can be looted.
Constraints :
0 <= n <= 10 ^ 4

Time Limit: 1 sec
Sample Input 1 :
6
5 5 10 100 10 5
Sample Output 1 :
110
Sample Input 2 :
6
10 2 30 20 3 50
Sample Output 2 :
90
Explanation of Sample Output 2 :
Looting first, third, and the last houses([10 + 30 + 50]) will result in the maximum loot,
 and all the other possible combinations would result in less than 90.
 */

package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LootHouses {

	
	 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		public static int[] takeInput() throws IOException {
			int n = Integer.parseInt(br.readLine().trim());

			if (n == 0) {
				return new int[0];
			}

			String[] strNums = br.readLine().trim().split("\\s");
	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(strNums[i]);
	        }

	        return arr;
		}

	    public static void main(String[] args) throws NumberFormatException, IOException {
	            int[] arr = takeInput();
	            System.out.println(Solution.maxMoneyLooted(arr));
	    }
}

class Solution {
    // dp recursive metho
    public static int maxMoneyLooted(int[] houses,int index,int[]  dp){
        if(index >= houses.length){
            return 0;
        }
        int money1;
        if(dp[index+2] == -1){
            money1 =  maxMoneyLooted(houses,index+2,dp);
            dp[index+2] = money1;
        }else{
            money1 = dp[index+2];
        }
        int sum1 = houses[index] + money1;
        
        int money2;
        if(dp[index+1] == -1){
            money2 =  maxMoneyLooted(houses,index+1,dp);
            dp[index+1] = money2;
        }else{
            money2 = dp[index+1];
        }
        
        int sum2 = money2;
        return Math.max(sum1,sum2);
    }
    
//     public static int maxMoneyLootedd(int[] houses,int index){
//         if(index >= houses.length){
//             return 0;
//         }
        
//         int sum1 = houses[index] + maxMoneyLooted(houses,index+2);
//         int sum2 = maxMoneyLooted(houses,index+1);
//         return Math.max(sum1,sum2);
//     }

	public static int maxMoneyLooted(int[] houses) {
		//Your code goes here
        int dp[] = new int[houses.length+2];
        for(int i=0;i<dp.length;i++){
            dp[i] = -1;
        }
        return maxMoneyLooted(houses,0,dp);
	}

}
