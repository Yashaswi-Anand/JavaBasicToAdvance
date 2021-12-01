/*
 *  (1) Sample Input  : 5 3 
		1 2 3 
		4 5 6 
		7 8 9 
		10 11 12 
		13 14 15
	Sample output -> 1 4 7 10 13 14 11 8 5 2 3 6 9 12 15 
	
	(2) Sample Input : 3 3
		10 20 30 
		40 50 60
		70 80 90
	Sample output -> 10 40 70 80 50 20 30 60 90 
 * 
 */


package Arrays2D;

import java.util.Scanner;

public class PrintLikeAWave {
	
	public static void wavePrint(int mat[][]){
		
        int m = mat.length;
        int n = 0;
        if(m !=0){
            n = mat[0].length;
        }
        
        Boolean flag = true;
        
        for(int i=0;i<n;i++){
            if(flag == true){
                for(int j=0;j<m;j++){
                	System.out.print(mat[j][i]+" ");
            	}
                flag = false;
            }else{
                for(int j=m-1;j>=0;j--){
                	System.out.print(mat[j][i]+" ");
            	}
                flag = true;
            }
        }
	}
	
	public static void take2DArrayInput(int row,int col) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of 2D Array:");
		int[][] arr = new int[row][col];
		
		for(int i=0;i<row;i++) 
			for(int j=0;j<col;j++) 
				arr[i][j] = sc.nextInt();
		
		wavePrint(arr);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of row ans column:");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		take2DArrayInput(row,col);

	}

}
