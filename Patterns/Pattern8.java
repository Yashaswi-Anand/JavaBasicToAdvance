package Patterns;
import java.util.*;
/*
  
    n=4
       1
      12
     123
    1234


 */

public class Pattern8 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        // logic
        for(int i=1;i<=n;i++){
            // for space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // for digit
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
