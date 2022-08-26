package Patterns;
import java.util.*;

/*

  n=4
   *
  ***
 *****
*******

 */
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int  n = sc.nextInt();

        // logic
        for(int i=1;i<=n;i++){
            // for spacing
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            // for star
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }    
}
