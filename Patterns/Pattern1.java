/*
 *     n=4
 *      4444
 *      4444
 *      4444
 *      4444
 */

package Patterns;
import java.util.*;

public class Pattern1{
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n =sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(n);
            }
            System.out.println();
        }
    }
}