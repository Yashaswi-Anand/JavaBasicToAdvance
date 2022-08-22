package Patterns;
import java.util.*;

/*
 
    n = 5
    A
    AB
    ABC
    ABCD
    ABCDE

 */

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        //logic
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int ch = 65+j-1;
                System.out.print((char)ch);
            }
            System.out.println();
        }
    }
}
