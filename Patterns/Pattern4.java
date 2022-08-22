package Patterns;
import java.util.Scanner;

/*
    n=6
    1
    21
    321
    4321
    54321
    654321

 */

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int  n = sc.nextInt();

        //logic
        for(int i=1;i<=n;i++){
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
