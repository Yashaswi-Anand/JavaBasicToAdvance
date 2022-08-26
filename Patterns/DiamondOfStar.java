package Patterns;

import java.util.Scanner;

public class DiamondOfStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        n=n/2;

        // logic
        // upper half part of diamond
        for(int i=1;i<=n;i++){

            // space print
           for(int k=n+1;k>i;k--){
            System.out.print(" ");
           }

            // star printting
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half part of diamond
        for(int i=n+1;i>0;i--){
            // space print
            for(int k=1;k<=n+1-i;k++){
                System.out.print(" ");
            }
            // star print
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
