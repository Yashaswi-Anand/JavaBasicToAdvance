package Patterns;
import java.util.*;

/*
 
    n  = 8
    H
    GH
    FGH
    EFGH
    DEFGH
    CDEFGH
    BCDEFGH
    ABCDEFGH

 */

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        // logic
        for(int i=n-1;i>=0;i--){
            char ch = (char) ('A'+i);
            for(int j=n-1;j>=i;j--){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
