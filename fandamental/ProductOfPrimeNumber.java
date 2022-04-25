/*
Given two numbers L and R (inclusive) find the product of primes within this range. 
Print the product modulo 109+7. If there are no primes in that range you must print 1.

Example 1:

Input: L = 1, R = 10
Output: 210
Explaination: The prime numbers are 
2, 3, 5 and 7.
Example 2:

Input: L = 1, R = 20
Output: 9699690
Explaination: The primes are 2, 3, 
5, 7, 11, 13, 17 and 19.
Your Task:
You do not need to read input or print anything. Your task is to complete the function primeProduct()
which takes L and R and returns the product of the primes within the range. If there are no primes in 
that range then return 1.

Expected Time Complexity: O((R-L)*(logR))
Expected Auxiliary Space: O(sqrt(R))

Constraints:
1 ≤ L ≤ R ≤ 109
0 ≤ L - R ≤ 106  
*/

package fandamental;
import java.util.*;

public class ProductOfPrimeNumber{

    // Time complexity: O(logR)
    public static boolean isPrime(long n){
        if(n==1) return false;
        for(long i=2;i*i<=n;i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static long primeProduct(long L, long R){
        // code here
        long multply = 1;
        for(long i=L;i<=R;i++){
            if(isPrime(i)){
                multply =(multply%1000000007) * (i%1000000007);
            }
        }
        return multply % 1000000007;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long R = sc.nextLong();
        System.out.println(primeProduct(L, R));
        sc.close();
    }

}
