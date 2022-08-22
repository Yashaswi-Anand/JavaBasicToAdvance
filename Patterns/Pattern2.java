package Patterns;
import java.util.*;


/*      n = 6
        *   
        **
        ***
        ****
        *****
        ******
 */
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n =sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
