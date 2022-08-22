package Patterns;

import java.util.Scanner;

/*
   n = 5
    A
    BC
    CDE
    DEFG
    EFGHI
 */

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        // logic
        for(int i=0;i<n;i++){
            char ch = (char) ('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(ch++);
            }
            System.out.println();
            
        }
    }
}
