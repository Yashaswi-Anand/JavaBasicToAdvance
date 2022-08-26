package Patterns;
import java.util.*;

/*
    n = 5
    55555
    4444
    333
    22
    1
 */

public class Pattern9 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        //logic
        for(int i=0;i<n;i++){
            int m = n-i;
            for(int j=m;j>0;j--){
                System.out.print(m);
            }
            System.out.println();
        }
        sc.close();
   } 
}
