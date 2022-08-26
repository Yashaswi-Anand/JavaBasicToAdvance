package Patterns;
import java.util.*;

/*
 n = 5
    1 
   2 3 2
  3 4 5 4 3
 4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
 */

public class TriangleOFNumber {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        // logic
        for(int i=1;i<=n;i++){
            // for space
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            // 1st part of digit
            int num = i;
            for(int k=i;k<=2*i-1;k++){
                System.out.print(num++ +" ");
            }
            // 2nd part of triangle
            
            for(int l=i-1;l>0;l--){
                System.out.print(--num-1+" ");
            }

            System.out.println();
        }

    }
    
}
